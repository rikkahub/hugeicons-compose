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

val HugeIcons.MapPinXInside: ImageVector
    get() {
        if (_mapPinXInside != null) {
            return _mapPinXInside!!
        }
        _mapPinXInside = ImageVector.Builder(
            name = "MapPinXInside",
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
            moveTo(14.5f, 8f)
            lineTo(12.0083f, 10.4958f)
            moveTo(12.0083f, 10.4958f)
            lineTo(9.50832f, 13f)
            moveTo(12.0083f, 10.4958f)
            lineTo(14.5083f, 13f)
            moveTo(12.0083f, 10.4958f)
            lineTo(9.51664f, 8f)
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
            moveTo(20f, 10.5352f)
            curveTo(19.9998f, 6.09743f, 16.4182f, 2.5f, 12f, 2.5f)
            curveTo(7.58184f, 2.5f, 4.00019f, 6.09743f, 4f, 10.5352f)
            curveTo(4f, 13.0728f, 5f, 15.0462f, 7f, 16.8086f)
            curveTo(8.07535f, 17.7562f, 9.82325f, 19.5313f, 11.0469f, 21.0625f)
            curveTo(11.2798f, 21.354f, 11.6397f, 21.5f, 12f, 21.5f)
            curveTo(12.3603f, 21.5f, 12.7202f, 21.354f, 12.9531f, 21.0625f)
            curveTo(14.1767f, 19.5313f, 15.9247f, 17.7562f, 17f, 16.8086f)
            curveTo(19f, 15.0462f, 20f, 13.0728f, 20f, 10.5352f)
            close()
        }
        }.build()

        return _mapPinXInside!!
    }

private var _mapPinXInside: ImageVector? = null
