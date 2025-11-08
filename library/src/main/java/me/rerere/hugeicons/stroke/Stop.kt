package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = ImageVector.Builder(
            name = "Stop",
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
        moveTo(4f, 12f)
        curveTo(4f, 8.72077f, 4f, 7.08116f, 4.81382f, 5.91891f)
        curveTo(5.1149f, 5.48891f, 5.48891f, 5.1149f, 5.91891f, 4.81382f)
        curveTo(7.08116f, 4f, 8.72077f, 4f, 12f, 4f)
        curveTo(15.2792f, 4f, 16.9188f, 4f, 18.0811f, 4.81382f)
        curveTo(18.5111f, 5.1149f, 18.8851f, 5.48891f, 19.1862f, 5.91891f)
        curveTo(20f, 7.08116f, 20f, 8.72077f, 20f, 12f)
        curveTo(20f, 15.2792f, 20f, 16.9188f, 19.1862f, 18.0811f)
        curveTo(18.8851f, 18.5111f, 18.5111f, 18.8851f, 18.0811f, 19.1862f)
        curveTo(16.9188f, 20f, 15.2792f, 20f, 12f, 20f)
        curveTo(8.72077f, 20f, 7.08116f, 20f, 5.91891f, 19.1862f)
        curveTo(5.48891f, 18.8851f, 5.1149f, 18.5111f, 4.81382f, 18.0811f)
        curveTo(4f, 16.9188f, 4f, 15.2792f, 4f, 12f)
        }
        }.build()

        return _stop!!
    }

private var _stop: ImageVector? = null
