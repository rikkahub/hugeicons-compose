package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Leaf02: ImageVector
    get() {
        if (_leaf02 != null) {
            return _leaf02!!
        }
        _leaf02 = ImageVector.Builder(
            name = "Leaf02",
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
        lineTo(17f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.69577f, 17.3042f)
        curveTo(4.5632f, 15.1717f, 3.85234f, 11.6174f, 8.11749f, 7.3522f)
        curveTo(13.4489f, 2.02076f, 20.913f, 3.08704f, 20.913f, 3.08704f)
        curveTo(20.913f, 3.08704f, 21.9792f, 10.5511f, 16.6478f, 15.8825f)
        curveTo(14.1373f, 18.3931f, 11.873f, 19.1796f, 10f, 18.9669f)
        }
        }.build()

        return _leaf02!!
    }

private var _leaf02: ImageVector? = null
