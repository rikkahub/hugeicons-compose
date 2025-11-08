package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowExpand02: ImageVector
    get() {
        if (_arrowExpand02 != null) {
            return _arrowExpand02!!
        }
        _arrowExpand02 = ImageVector.Builder(
            name = "ArrowExpand02",
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
        moveTo(7.5f, 3.26621f)
        curveTo(6.6556f, 3.25421f, 3.8591f, 2.67328f, 3.2662f, 3.26621f)
        curveTo(2.6733f, 3.85913f, 3.2542f, 6.65559f, 3.2662f, 7.5f)
        moveTo(3.49401f, 3.49097f)
        lineTo(10.4978f, 10.4961f)
        moveTo(20.7338f, 16.5f)
        curveTo(20.7458f, 17.3444f, 21.3267f, 20.1409f, 20.7338f, 20.7338f)
        curveTo(20.1409f, 21.3267f, 17.3444f, 20.7458f, 16.5f, 20.7338f)
        moveTo(13.4981f, 13.4974f)
        lineTo(20.5019f, 20.5026f)
        }
        }.build()

        return _arrowExpand02!!
    }

private var _arrowExpand02: ImageVector? = null
