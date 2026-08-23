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

val HugeIcons.MapPinCheck: ImageVector
    get() {
        if (_mapPinCheck != null) {
            return _mapPinCheck!!
        }
        _mapPinCheck = ImageVector.Builder(
            name = "MapPinCheck",
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
            moveTo(14.5f, 10.5f)
            curveTo(14.5f, 12.1569f, 13.1569f, 13.5f, 11.5f, 13.5f)
            curveTo(9.84315f, 13.5f, 8.5f, 12.1569f, 8.5f, 10.5f)
            curveTo(8.5f, 8.84315f, 9.84315f, 7.5f, 11.5f, 7.5f)
            curveTo(13.1569f, 7.5f, 14.5f, 8.84315f, 14.5f, 10.5f)
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
            moveTo(12.4535f, 21.0628f)
            curveTo(11.9877f, 21.6457f, 11.0123f, 21.6457f, 10.5465f, 21.0628f)
            curveTo(9.32291f, 19.5316f, 7.57535f, 17.7562f, 6.5f, 16.8086f)
            curveTo(4.5f, 15.0462f, 3.5f, 13.0731f, 3.5f, 10.5355f)
            curveTo(3.5f, 6.09762f, 7.08172f, 2.5f, 11.5f, 2.5f)
            curveTo(15.9183f, 2.5f, 19.5f, 6.09762f, 19.5f, 10.5355f)
            curveTo(19.5f, 11.0455f, 19.4596f, 11.5327f, 19.3788f, 12f)
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
            moveTo(14.5f, 17.5f)
            lineTo(16.5f, 19.5f)
            lineTo(20.5f, 15.5f)
        }
        }.build()

        return _mapPinCheck!!
    }

private var _mapPinCheck: ImageVector? = null
