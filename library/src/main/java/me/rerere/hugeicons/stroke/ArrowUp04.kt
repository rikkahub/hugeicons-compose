package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUp04: ImageVector
    get() {
        if (_arrowUp04 != null) {
            return _arrowUp04!!
        }
        _arrowUp04 = ImageVector.Builder(
            name = "ArrowUp04",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        lineTo(12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6026f, 5.41415f)
        lineTo(14.3639f, 6.38058f)
        curveTo(15.5974f, 7.94638f, 16.2141f, 8.72928f, 15.9328f, 9.36464f)
        curveTo(15.6515f, 10f, 14.6881f, 10f, 12.7613f, 10f)
        horizontalLineTo(11.2387f)
        curveTo(9.31191f, 10f, 8.34853f, 10f, 8.06721f, 9.36464f)
        curveTo(7.7859f, 8.72928f, 8.40264f, 7.94638f, 9.63612f, 6.38059f)
        lineTo(10.3974f, 5.41415f)
        curveTo(11.1401f, 4.47138f, 11.5115f, 4f, 12f, 4f)
        curveTo(12.4885f, 4f, 12.8599f, 4.47138f, 13.6026f, 5.41415f)
        }
        }.build()

        return _arrowUp04!!
    }

private var _arrowUp04: ImageVector? = null
