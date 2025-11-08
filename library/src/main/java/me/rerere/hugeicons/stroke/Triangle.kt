package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = ImageVector.Builder(
            name = "Triangle",
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
        moveTo(5.59347f, 9.22474f)
        curveTo(7.83881f, 5.62322f, 8.96148f, 3.82246f, 10.4326f, 3.28f)
        curveTo(11.445f, 2.90667f, 12.555f, 2.90667f, 13.5674f, 3.28f)
        curveTo(15.0385f, 3.82246f, 16.1612f, 5.62322f, 18.4065f, 9.22474f)
        curveTo(20.9338f, 13.2785f, 22.1975f, 15.3054f, 21.9749f, 16.9779f)
        curveTo(21.8222f, 18.125f, 21.2521f, 19.173f, 20.3762f, 19.9163f)
        curveTo(19.0993f, 21f, 16.7328f, 21f, 12f, 21f)
        curveTo(7.26716f, 21f, 4.90074f, 21f, 3.62378f, 19.9163f)
        curveTo(2.74792f, 19.173f, 2.17775f, 18.125f, 2.02509f, 16.9779f)
        curveTo(1.80252f, 15.3054f, 3.06617f, 13.2785f, 5.59347f, 9.22474f)
        }
        }.build()

        return _triangle!!
    }

private var _triangle: ImageVector? = null
