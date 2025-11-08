package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EidMubarak: ImageVector
    get() {
        if (_eidMubarak != null) {
            return _eidMubarak!!
        }
        _eidMubarak = ImageVector.Builder(
            name = "EidMubarak",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11.8049f)
        curveTo(3f, 17.1594f, 7.34065f, 21.5f, 12.6951f, 21.5f)
        curveTo(17.101f, 21.5f, 20.8204f, 18.5611f, 22f, 14.5367f)
        curveTo(20.5791f, 15.5691f, 18.8306f, 16.1779f, 16.94f, 16.1779f)
        curveTo(12.1804f, 16.1779f, 8.32208f, 12.3196f, 8.32208f, 7.56005f)
        curveTo(8.32208f, 5.66937f, 8.93094f, 3.9209f, 9.96326f, 2.5f)
        curveTo(5.9389f, 3.67959f, 3f, 7.39904f, 3f, 11.8049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.7503f, 8.5f)
        curveTo(11.3263f, 5.5f, 15.4612f, 4f, 16.4999f, 2.5f)
        curveTo(17.5388f, 4f, 21.6737f, 5.5f, 19.2497f, 8.5f)
        moveTo(13.7503f, 8.5f)
        horizontalLineTo(19.2497f)
        moveTo(13.7503f, 8.5f)
        verticalLineTo(15.5f)
        moveTo(19.2497f, 8.5f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _eidMubarak!!
    }

private var _eidMubarak: ImageVector? = null
