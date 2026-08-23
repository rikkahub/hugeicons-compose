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

val HugeIcons.BeefOff: ImageVector
    get() {
        if (_beefOff != null) {
            return _beefOff!!
        }
        _beefOff = ImageVector.Builder(
            name = "BeefOff",
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
            moveTo(10f, 10f)
            curveTo(10f, 11.1046f, 9.10457f, 12f, 8f, 12f)
            curveTo(6.89543f, 12f, 6f, 11.1046f, 6f, 10f)
            curveTo(6f, 8.89543f, 6.89543f, 8f, 8f, 8f)
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
            moveTo(4.87627f, 4.87627f)
            curveTo(3.15132f, 5.93015f, 2f, 7.83062f, 2f, 10f)
            curveTo(2f, 13.3137f, 4.68629f, 16f, 8f, 16f)
            curveTo(9.05861f, 16f, 10.0532f, 15.7258f, 10.9166f, 15.2447f)
            curveTo(11.9804f, 14.6518f, 12.7238f, 14.1222f, 13.624f, 13.624f)
            moveTo(9f, 4f)
            horizontalLineTo(18f)
            curveTo(20.2091f, 4f, 22f, 5.79086f, 22f, 8f)
            curveTo(22f, 10.2091f, 20.2318f, 11.442f, 18f, 12f)
            curveTo(17.7213f, 12.0697f, 17.4581f, 12.1392f, 17.2088f, 12.2088f)
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
            moveTo(2.00012f, 10f)
            lineTo(2f, 14f)
            curveTo(2f, 17.3137f, 4.68629f, 20f, 8f, 20f)
            curveTo(9.05861f, 20f, 10.0532f, 19.7258f, 10.9166f, 19.2447f)
            curveTo(12.8575f, 18.163f, 13.7322f, 17.2917f, 16.4376f, 16.4376f)
            moveTo(22f, 8f)
            verticalLineTo(12f)
            curveTo(22f, 13.4265f, 21.2627f, 14.4459f, 20.1394f, 15.1394f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _beefOff!!
    }

private var _beefOff: ImageVector? = null
