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

val HugeIcons.SunSnow: ImageVector
    get() {
        if (_sunSnow != null) {
            return _sunSnow!!
        }
        _sunSnow = ImageVector.Builder(
            name = "SunSnow",
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
            moveTo(11f, 16f)
            curveTo(8.79086f, 16f, 7f, 14.2091f, 7f, 12f)
            curveTo(7f, 9.79086f, 8.79086f, 8f, 11f, 8f)
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
            moveTo(10.9983f, 3f)
            lineTo(11f, 5f)
            moveTo(10.9983f, 19f)
            verticalLineTo(21f)
            moveTo(6f, 17f)
            lineTo(4.5f, 18.5f)
            moveTo(4f, 12f)
            lineTo(2f, 12f)
            moveTo(6f, 7f)
            lineTo(4.5f, 5.5f)
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
            moveTo(15.5703f, 21f)
            lineTo(15.9426f, 19.7966f)
            curveTo(16.206f, 18.9453f, 16.3377f, 18.5197f, 16.6824f, 18.3241f)
            curveTo(17.0271f, 18.1286f, 17.4601f, 18.2338f, 18.3259f, 18.4444f)
            lineTo(19.4985f, 18.7296f)
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
            moveTo(20.0007f, 5.26825f)
            lineTo(18.3972f, 5.60349f)
            curveTo(17.5008f, 5.79091f, 17.0525f, 5.88462f, 16.7102f, 5.66833f)
            curveTo(16.3678f, 5.45205f, 16.26f, 5.00703f, 16.0442f, 4.11698f)
            lineTo(15.7734f, 3f)
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
            moveTo(20.0001f, 12f)
            lineTo(13f, 12.0003f)
            moveTo(16.5001f, 6f)
            lineTo(13f, 12.0003f)
            lineTo(16.5001f, 17.9995f)
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
            moveTo(21.9937f, 14.25f)
            curveTo(21.5904f, 13.807f, 19.9991f, 12.6272f, 20f, 11.997f)
            curveTo(20.0009f, 11.3668f, 21.5955f, 10.1918f, 22f, 9.75f)
        }
        }.build()

        return _sunSnow!!
    }

private var _sunSnow: ImageVector? = null
