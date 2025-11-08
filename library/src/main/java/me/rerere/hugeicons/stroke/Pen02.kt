package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pen02: ImageVector
    get() {
        if (_pen02 != null) {
            return _pen02!!
        }
        _pen02 = ImageVector.Builder(
            name = "Pen02",
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
        moveTo(3f, 21f)
        lineTo(3.85763f, 17.9983f)
        curveTo(3.951f, 17.6715f, 4.12612f, 17.3739f, 4.36646f, 17.1335f)
        lineTo(18.2062f, 3.29289f)
        curveTo(18.5967f, 2.90237f, 19.2299f, 2.90237f, 19.6204f, 3.29289f)
        lineTo(20.7062f, 4.37868f)
        curveTo(21.0967f, 4.7692f, 21.0967f, 5.40237f, 20.7062f, 5.79289f)
        lineTo(6.86646f, 19.6335f)
        curveTo(6.62612f, 19.8739f, 6.3285f, 20.049f, 6.00169f, 20.1424f)
        lineTo(3f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9999f, 5.49854f)
        lineTo(18.3786f, 7.87722f)
        curveTo(19.3786f, 8.87722f, 19.8786f, 9.37721f, 19.8786f, 9.99854f)
        curveTo(19.8786f, 10.6199f, 19.3786f, 11.1199f, 18.3786f, 12.1199f)
        lineTo(17.4999f, 12.9985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.49994f, 12.9985f)
        lineTo(10.9999f, 15.4985f)
        }
        }.build()

        return _pen02!!
    }

private var _pen02: ImageVector? = null
