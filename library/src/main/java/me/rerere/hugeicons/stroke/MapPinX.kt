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

val HugeIcons.MapPinX: ImageVector
    get() {
        if (_mapPinX != null) {
            return _mapPinX!!
        }
        _mapPinX = ImageVector.Builder(
            name = "MapPinX",
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
            moveTo(20.4917f, 15.5f)
            lineTo(18f, 17.9958f)
            moveTo(18f, 17.9958f)
            lineTo(15.5f, 20.5f)
            moveTo(18f, 17.9958f)
            lineTo(20.5f, 20.5f)
            moveTo(18f, 17.9958f)
            lineTo(15.5083f, 15.5f)
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
            moveTo(11.5f, 21.5f)
            curveTo(11.1397f, 21.5f, 10.7798f, 21.354f, 10.5469f, 21.0625f)
            curveTo(9.32325f, 19.5313f, 7.57535f, 17.7562f, 6.5f, 16.8086f)
            curveTo(4.5f, 15.0462f, 3.5f, 13.0728f, 3.5f, 10.5352f)
            curveTo(3.50019f, 6.09743f, 7.08184f, 2.5f, 11.5f, 2.5f)
            curveTo(15.9182f, 2.5f, 19.4998f, 6.09743f, 19.5f, 10.5352f)
            curveTo(19.5f, 10.8661f, 19.483f, 11.1875f, 19.449f, 11.5f)
        }
        }.build()

        return _mapPinX!!
    }

private var _mapPinX: ImageVector? = null
