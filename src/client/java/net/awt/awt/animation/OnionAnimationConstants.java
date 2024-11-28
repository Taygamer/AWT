package net.awt.awt.animation;

import loqor.ait.core.tardis.handler.travel.TravelHandlerBase;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class OnionAnimationConstants {
	public static final Animation TAKEOFF = Animation.Builder.create(10.5f)
			.addBoneAnimation("OmgitsaUFO",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Leg1",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3.5f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint3",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Leg2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint5",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3.5f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint6",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Leg3",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(4f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint8",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3.5f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Joint9",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR),
							new Keyframe(3f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Petals",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 66f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 180f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 540f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 900f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 1260f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(2.5f, AnimationHelper.createRotationalVector(0f, 1620f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, 1980f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(4f, AnimationHelper.createRotationalVector(0f, 2700f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 3420f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 4140f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(7f, AnimationHelper.createRotationalVector(0f, 4860f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(8f, AnimationHelper.createRotationalVector(0f, 5580f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(0f, 6300f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 7020f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10.5f, AnimationHelper.createRotationalVector(0f, 7380f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Root",
					new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(1.5f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(2.5f, AnimationHelper.createTranslationalVector(0f, 2f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(3.5f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(4.5f, AnimationHelper.createTranslationalVector(0f, 2f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Root",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(4f, AnimationHelper.createRotationalVector(0f, -90f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(5.5f, AnimationHelper.createRotationalVector(0f, -270f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(7f, AnimationHelper.createRotationalVector(0f, -540f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(8.5f, AnimationHelper.createRotationalVector(0f, -900f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10.5f, AnimationHelper.createRotationalVector(0f, -1260f, 0f),
									Transformation.Interpolations.CUBIC))).build();

	public static final Animation LANDING = Animation.Builder.create(12f)
			.addBoneAnimation("OmgitsaUFO",
					new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0f, AnimationHelper.createScalingVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Root",
					new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(7f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(8f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createTranslationalVector(0f, 4f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Root",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -1845f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, -1485f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(2f, AnimationHelper.createRotationalVector(0f, -1125f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, -855f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(4f, AnimationHelper.createRotationalVector(0f, -675f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(5f, AnimationHelper.createRotationalVector(0f, -495f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, -315f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(7f, AnimationHelper.createRotationalVector(0f, -135f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(8f, AnimationHelper.createRotationalVector(0f, -45f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Petals",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -3240f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(1f, AnimationHelper.createRotationalVector(0f, -2520f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(2f, AnimationHelper.createRotationalVector(0f, -1800f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(3f, AnimationHelper.createRotationalVector(0f, -1080f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(4f, AnimationHelper.createRotationalVector(0f, -360f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 360f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 1080f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(7f, AnimationHelper.createRotationalVector(0f, 1800f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(8f, AnimationHelper.createRotationalVector(0f, 2520f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(0f, 3240f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 3420f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(11f, AnimationHelper.createRotationalVector(0f, 3510f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(11.5f, AnimationHelper.createRotationalVector(0f, 3510f, 0f),
									Transformation.Interpolations.CUBIC)))
			.addBoneAnimation("Leg1",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint3",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Leg2",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint5",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint6",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Leg3",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(-30f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint8",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(90f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("Joint9",
					new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(8f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(9f, AnimationHelper.createRotationalVector(67.5f, 0f, 0f),
									Transformation.Interpolations.CUBIC),
							new Keyframe(10f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
									Transformation.Interpolations.LINEAR))).build();

	public static Animation forState(TravelHandlerBase.State state) {
		return switch (state) {
			case MAT -> LANDING;
			case DEMAT -> TAKEOFF;
			default -> null;
		};
	}
}
