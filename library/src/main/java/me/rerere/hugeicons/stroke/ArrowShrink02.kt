package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowShrink02: ImageVector
    get() {
        if (_arrowShrink02 != null) {
            return _arrowShrink02!!
        }
        _arrowShrink02 = ImageVector.Builder(
            name = "ArrowShrink02",
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
        moveTo(6.50232f, 13.2635f)
        curveTo(7.34673f, 13.2515f, 10.1432f, 12.6706f, 10.7361f, 13.2635f)
        curveTo(11.329f, 13.8564f, 10.7481f, 16.6529f, 10.7361f, 17.4973f)
        moveTo(13.2685f, 6.49733f)
        curveTo(13.2565f, 7.34173f, 12.6756f, 10.1382f, 13.2685f, 10.7311f)
        curveTo(13.8614f, 11.324f, 16.6579f, 10.7431f, 17.5023f, 10.7311f)
        moveTo(20.9991f, 2.99902f)
        lineTo(13.6103f, 10.3812f)
        moveTo(10.3691f, 13.6237f)
        lineTo(3f, 21.001f)
        }
        }.build()

        return _arrowShrink02!!
    }

private var _arrowShrink02: ImageVector? = null
