package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreVertical: ImageVector
    get() {
        if (_moreVertical != null) {
            return _moreVertical!!
        }
        _moreVertical = ImageVector.Builder(
            name = "MoreVertical",
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
        moveTo(11.9967f, 11.5f)
        curveTo(12.549f, 11.5f, 12.9967f, 11.9477f, 12.9967f, 12.5f)
        curveTo(12.9967f, 13.0523f, 12.549f, 13.5f, 11.9967f, 13.5f)
        curveTo(11.4444f, 13.5f, 10.9967f, 13.0523f, 10.9967f, 12.5f)
        curveTo(10.9967f, 11.9477f, 11.4444f, 11.5f, 11.9967f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9967f, 5.5f)
        curveTo(12.549f, 5.5f, 12.9967f, 5.94772f, 12.9967f, 6.5f)
        curveTo(12.9967f, 7.05228f, 12.549f, 7.5f, 11.9967f, 7.5f)
        curveTo(11.4444f, 7.5f, 10.9967f, 7.05228f, 10.9967f, 6.5f)
        curveTo(10.9967f, 5.94772f, 11.4444f, 5.5f, 11.9967f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9967f, 17.5f)
        curveTo(12.549f, 17.5f, 12.9967f, 17.9477f, 12.9967f, 18.5f)
        curveTo(12.9967f, 19.0523f, 12.549f, 19.5f, 11.9967f, 19.5f)
        curveTo(11.4444f, 19.5f, 10.9967f, 19.0523f, 10.9967f, 18.5f)
        curveTo(10.9967f, 17.9477f, 11.4444f, 17.5f, 11.9967f, 17.5f)
        }
        }.build()

        return _moreVertical!!
    }

private var _moreVertical: ImageVector? = null
