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

val HugeIcons.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) {
            return _mapPinPlus!!
        }
        _mapPinPlus = ImageVector.Builder(
            name = "MapPinPlus",
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
            moveTo(17.495f, 14.5f)
            verticalLineTo(20.5f)
            moveTo(20.5f, 17.495f)
            lineTo(14.5f, 17.495f)
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
            moveTo(19.5f, 10.5352f)
            curveTo(19.4998f, 6.09743f, 15.9182f, 2.5f, 11.5f, 2.5f)
            curveTo(7.08184f, 2.5f, 3.50019f, 6.09743f, 3.5f, 10.5352f)
            curveTo(3.5f, 13.0728f, 4.5f, 15.0462f, 6.5f, 16.8086f)
            curveTo(7.57535f, 17.7562f, 9.32325f, 19.5313f, 10.5469f, 21.0625f)
            curveTo(10.7798f, 21.354f, 11.1397f, 21.5f, 11.5f, 21.5f)
            curveTo(11.8603f, 21.5f, 12.2202f, 21.354f, 12.4531f, 21.0625f)
        }
        }.build()

        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
