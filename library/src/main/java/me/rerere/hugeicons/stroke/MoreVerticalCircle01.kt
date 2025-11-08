package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreVerticalCircle01: ImageVector
    get() {
        if (_moreVerticalCircle01 != null) {
            return _moreVerticalCircle01!!
        }
        _moreVerticalCircle01 = ImageVector.Builder(
            name = "MoreVerticalCircle01",
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
        moveTo(13.5f, 4.5f)
        curveTo(13.5f, 3.67157f, 12.8284f, 3f, 12f, 3f)
        curveTo(11.1716f, 3f, 10.5f, 3.67157f, 10.5f, 4.5f)
        curveTo(10.5f, 5.32843f, 11.1716f, 6f, 12f, 6f)
        curveTo(12.8284f, 6f, 13.5f, 5.32843f, 13.5f, 4.5f)
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
        moveTo(13.5f, 19.5f)
        curveTo(13.5f, 18.6716f, 12.8284f, 18f, 12f, 18f)
        curveTo(11.1716f, 18f, 10.5f, 18.6716f, 10.5f, 19.5f)
        curveTo(10.5f, 20.3284f, 11.1716f, 21f, 12f, 21f)
        curveTo(12.8284f, 21f, 13.5f, 20.3284f, 13.5f, 19.5f)
        }
        }.build()

        return _moreVerticalCircle01!!
    }

private var _moreVerticalCircle01: ImageVector? = null
