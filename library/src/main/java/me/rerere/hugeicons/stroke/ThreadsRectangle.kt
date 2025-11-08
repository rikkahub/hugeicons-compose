package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreadsRectangle: ImageVector
    get() {
        if (_threadsRectangle != null) {
            return _threadsRectangle!!
        }
        _threadsRectangle = ImageVector.Builder(
            name = "ThreadsRectangle",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9.58944f)
        curveTo(15.9124f, 5.54334f, 12.1724f, 5.79609f, 12.1724f, 5.79609f)
        curveTo(12.1724f, 5.79609f, 7f, 5.45167f, 7f, 11.9999f)
        curveTo(7f, 18.5481f, 12.1724f, 18.2036f, 12.1724f, 18.2036f)
        curveTo(12.1724f, 18.2036f, 15.2467f, 18.4084f, 16.6552f, 15.5021f)
        curveTo(17.1149f, 14.2208f, 17f, 11.6584f, 12.5172f, 11.6584f)
        curveTo(12.5172f, 11.6584f, 10.4483f, 11.6584f, 10.4483f, 13.3825f)
        curveTo(10.4483f, 14.0559f, 11.1379f, 14.7619f, 12.1724f, 14.7619f)
        curveTo(13.2069f, 14.7619f, 14.3594f, 14.0534f, 14.5862f, 12.6929f)
        curveTo(15.2759f, 8.55496f, 11.4828f, 8.21013f, 10.4483f, 9.93427f)
        }
        }.build()

        return _threadsRectangle!!
    }

private var _threadsRectangle: ImageVector? = null
