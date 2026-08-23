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

val HugeIcons.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) {
            return _heartHandshake!!
        }
        _heartHandshake = ImageVector.Builder(
            name = "HeartHandshake",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.6692f, 14.6692f)
            curveTo(21.01f, 12.9629f, 22f, 11.0686f, 22f, 9.19444f)
            curveTo(22f, 6.32563f, 19.8947f, 4f, 17f, 4f)
            curveTo(15.5f, 4f, 14f, 4.5f, 12f, 6.5f)
            curveTo(10f, 4.5f, 8.5f, 4f, 7f, 4f)
            curveTo(4.10526f, 4f, 2f, 6.32563f, 2f, 9.19444f)
            curveTo(2f, 14.2666f, 9.25143f, 19.4872f, 11.0835f, 20.7252f)
            curveTo(11.3541f, 20.9081f, 11.6734f, 21f, 12f, 21f)
            curveTo(12.3266f, 21f, 12.6459f, 20.9081f, 12.9165f, 20.7252f)
            curveTo(13.0217f, 20.6541f, 13.1449f, 20.5699f, 13.2835f, 20.4732f)
            curveTo(14.2796f, 19.7789f, 14.3586f, 18.3586f, 13.5f, 17.5f)
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
            moveTo(18.5f, 11f)
            lineTo(19.49f, 11.99f)
            curveTo(20.1988f, 12.6988f, 20.3483f, 13.795f, 19.7336f, 14.5868f)
            curveTo(18.9878f, 15.5474f, 17.5632f, 15.5632f, 16.7032f, 14.7032f)
            lineTo(16.5f, 14.5f)
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
            moveTo(16.5f, 14.5f)
            lineTo(16.6942f, 14.6942f)
            curveTo(17.5691f, 15.5691f, 17.51f, 17.0612f, 16.5833f, 17.8811f)
            curveTo(15.7193f, 18.6455f, 14.4965f, 18.4965f, 13.6808f, 17.6808f)
            lineTo(13.5f, 17.5f)
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
            moveTo(12.0002f, 6.5f)
            lineTo(9.25019f, 9.25f)
            curveTo(8.55983f, 9.94036f, 8.55983f, 11.0596f, 9.25019f, 11.75f)
            curveTo(9.94055f, 12.4404f, 11.0598f, 12.4404f, 11.7502f, 11.75f)
            lineTo(13.5002f, 10f)
            curveTo(14.0454f, 9.45475f, 14.3181f, 9.18212f, 14.6122f, 9.03639f)
            curveTo(15.1717f, 8.75911f, 15.8287f, 8.75911f, 16.3882f, 9.03639f)
            curveTo(16.6823f, 9.18212f, 16.9549f, 9.45475f, 17.5002f, 10f)
            lineTo(19.0002f, 11.5f)
        }
        }.build()

        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
