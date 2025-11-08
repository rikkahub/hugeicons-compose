package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreHorizontalCircle01: ImageVector
    get() {
        if (_moreHorizontalCircle01 != null) {
            return _moreHorizontalCircle01!!
        }
        _moreHorizontalCircle01 = ImageVector.Builder(
            name = "MoreHorizontalCircle01",
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
        moveTo(21f, 12f)
        curveTo(21f, 11.1716f, 20.3284f, 10.5f, 19.5f, 10.5f)
        curveTo(18.6716f, 10.5f, 18f, 11.1716f, 18f, 12f)
        curveTo(18f, 12.8284f, 18.6716f, 13.5f, 19.5f, 13.5f)
        curveTo(20.3284f, 13.5f, 21f, 12.8284f, 21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12f, 10.5f)
        curveTo(11.1716f, 10.5f, 10.5f, 11.1716f, 10.5f, 12f)
        curveTo(10.5f, 12.8284f, 11.1716f, 13.5f, 12f, 13.5f)
        curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(6f, 11.1716f, 5.32843f, 10.5f, 4.5f, 10.5f)
        curveTo(3.67157f, 10.5f, 3f, 11.1716f, 3f, 12f)
        curveTo(3f, 12.8284f, 3.67157f, 13.5f, 4.5f, 13.5f)
        curveTo(5.32843f, 13.5f, 6f, 12.8284f, 6f, 12f)
        }
        }.build()

        return _moreHorizontalCircle01!!
    }

private var _moreHorizontalCircle01: ImageVector? = null
