package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowShrink01: ImageVector
    get() {
        if (_arrowShrink01 != null) {
            return _arrowShrink01!!
        }
        _arrowShrink01 = ImageVector.Builder(
            name = "ArrowShrink01",
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
        moveTo(6.5023f, 10.7365f)
        curveTo(7.34671f, 10.7485f, 10.1432f, 11.3294f, 10.7361f, 10.7365f)
        curveTo(11.329f, 10.1436f, 10.7481f, 7.34708f, 10.7361f, 6.50267f)
        moveTo(13.2685f, 17.5027f)
        curveTo(13.2565f, 16.6583f, 12.6756f, 13.8618f, 13.2685f, 13.2689f)
        curveTo(13.8614f, 12.676f, 16.6579f, 13.2569f, 17.5023f, 13.2689f)
        moveTo(20.9991f, 21.001f)
        lineTo(13.6102f, 13.6188f)
        moveTo(10.3691f, 10.3763f)
        lineTo(2.99997f, 2.99902f)
        }
        }.build()

        return _arrowShrink01!!
    }

private var _arrowShrink01: ImageVector? = null
