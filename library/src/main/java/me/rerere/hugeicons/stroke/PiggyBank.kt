package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = ImageVector.Builder(
            name = "PiggyBank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 5.5f)
            horizontalLineTo(10.5f)
            curveTo(6.91015f, 5.5f, 4f, 8.41015f, 4f, 12f)
            curveTo(4f, 14.3012f, 5.19584f, 16.3231f, 7f, 17.4782f)
            lineTo(7.28751f, 19.2158f)
            curveTo(7.35758f, 19.6393f, 7.39262f, 19.851f, 7.4905f, 20.0143f)
            curveTo(7.6037f, 20.2031f, 7.77604f, 20.3492f, 7.98078f, 20.4301f)
            curveTo(8.1578f, 20.5f, 8.37243f, 20.5f, 8.80169f, 20.5f)
            curveTo(9.19947f, 20.5f, 9.39836f, 20.5f, 9.56635f, 20.4378f)
            curveTo(9.76071f, 20.3659f, 9.92792f, 20.2353f, 10.0449f, 20.0642f)
            curveTo(10.1459f, 19.9163f, 10.1942f, 19.7234f, 10.2906f, 19.3375f)
            lineTo(10.5f, 18.5f)
            horizontalLineTo(13.5f)
            lineTo(13.7094f, 19.3375f)
            curveTo(13.8058f, 19.7234f, 13.8541f, 19.9163f, 13.9551f, 20.0642f)
            curveTo(14.0721f, 20.2353f, 14.2393f, 20.3659f, 14.4337f, 20.4378f)
            curveTo(14.6016f, 20.5f, 14.8005f, 20.5f, 15.1983f, 20.5f)
            curveTo(15.6276f, 20.5f, 15.8422f, 20.5f, 16.0192f, 20.4301f)
            curveTo(16.224f, 20.3492f, 16.3963f, 20.2031f, 16.5095f, 20.0143f)
            curveTo(16.6074f, 19.851f, 16.6424f, 19.6393f, 16.7125f, 19.2158f)
            lineTo(17f, 17.4782f)
            curveTo(18.1096f, 16.7678f, 18.9891f, 15.7295f, 19.5018f, 14.5f)
            lineTo(20.3925f, 14.3217f)
            curveTo(21.162f, 14.1677f, 21.5468f, 14.0907f, 21.7734f, 13.8142f)
            curveTo(22f, 13.5378f, 22f, 13.1454f, 22f, 12.3606f)
            verticalLineTo(12.0616f)
            curveTo(22f, 11.3116f, 22f, 10.9366f, 21.7882f, 10.6654f)
            curveTo(21.5764f, 10.3941f, 21.2126f, 10.3032f, 20.4851f, 10.1213f)
            lineTo(20f, 10f)
            curveTo(20f, 8.5f, 18.8333f, 7.16667f, 18f, 6.5f)
            verticalLineTo(3.5f)
            horizontalLineTo(17.7361f)
            curveTo(16.3657f, 3.5f, 15.1129f, 4.27427f, 14.5f, 5.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.875f, 9.75f)
            horizontalLineTo(15.75f)
            moveTo(16f, 9.75f)
            curveTo(16f, 9.88807f, 15.8881f, 10f, 15.75f, 10f)
            curveTo(15.6119f, 10f, 15.5f, 9.88807f, 15.5f, 9.75f)
            curveTo(15.5f, 9.61193f, 15.6119f, 9.5f, 15.75f, 9.5f)
            curveTo(15.8881f, 9.5f, 16f, 9.61193f, 16f, 9.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 8f)
            verticalLineTo(10f)
            curveTo(2f, 11.1046f, 2.89543f, 12f, 4f, 12f)
        }
        }.build()

        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
