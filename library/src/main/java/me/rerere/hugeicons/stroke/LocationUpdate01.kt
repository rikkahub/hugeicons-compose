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

val HugeIcons.LocationUpdate01: ImageVector
    get() {
        if (_locationUpdate01 != null) {
            return _locationUpdate01!!
        }
        _locationUpdate01 = ImageVector.Builder(
            name = "LocationUpdate01",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.8083f, 16.6835f)
            curveTo(12.5915f, 16.8865f, 12.3017f, 17f, 12.0001f, 17f)
            curveTo(11.6985f, 17f, 11.4087f, 16.8865f, 11.1919f, 16.6835f)
            curveTo(9.20634f, 14.813f, 6.54548f, 12.7235f, 7.8431f, 9.68983f)
            curveTo(8.54471f, 8.04958f, 10.2289f, 7f, 12.0001f, 7f)
            curveTo(13.7713f, 7f, 15.4555f, 8.04958f, 16.1571f, 9.68983f)
            curveTo(17.4531f, 12.7196f, 14.7988f, 14.8194f, 12.8083f, 16.6835f)
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
            moveTo(20f, 11f)
            lineTo(22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
            moveTo(4f, 13f)
            lineTo(2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            curveTo(16.1006f, 22f, 19.6248f, 19.5318f, 21.1679f, 16f)
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
            moveTo(12.125f, 11.5f)
            horizontalLineTo(12f)
            moveTo(12.25f, 11.5f)
            curveTo(12.25f, 11.6381f, 12.1381f, 11.75f, 12f, 11.75f)
            curveTo(11.8619f, 11.75f, 11.75f, 11.6381f, 11.75f, 11.5f)
            curveTo(11.75f, 11.3619f, 11.8619f, 11.25f, 12f, 11.25f)
            curveTo(12.1381f, 11.25f, 12.25f, 11.3619f, 12.25f, 11.5f)
            close()
        }
        }.build()

        return _locationUpdate01!!
    }

private var _locationUpdate01: ImageVector? = null
