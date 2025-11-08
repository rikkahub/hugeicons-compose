package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandBeater: ImageVector
    get() {
        if (_handBeater != null) {
            return _handBeater!!
        }
        _handBeater = ImageVector.Builder(
            name = "HandBeater",
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
        moveTo(6.91699f, 21.8262f)
        lineTo(2.6739f, 17.5853f)
        curveTo(2.41158f, 17.3231f, 2.44759f, 16.8882f, 2.74947f, 16.6727f)
        curveTo(4.18235f, 15.6497f, 6.14516f, 15.8121f, 7.39028f, 17.0566f)
        lineTo(7.44596f, 17.1122f)
        curveTo(8.69108f, 18.3567f, 8.85352f, 20.3185f, 7.83004f, 21.7507f)
        curveTo(7.61441f, 22.0524f, 7.17931f, 22.0884f, 6.91699f, 21.8262f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 17.002f)
        lineTo(11.502f, 13.002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.998f, 9.50198f)
        horizontalLineTo(15.007f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3631f, 5.67983f)
        curveTo(17.7916f, 3.92938f, 17.6251f, 2.68028f, 18.5622f, 2.01555f)
        curveTo(18.8557f, 1.88862f, 19.7716f, 2.46754f, 20.6767f, 3.28985f)
        curveTo(21.7027f, 4.22211f, 22.67f, 5.50263f, 22.4779f, 5.99628f)
        curveTo(21.8543f, 6.69231f, 20.5862f, 6.98319f, 19.2047f, 9.52817f)
        curveTo(17.4362f, 12.4935f, 14.9751f, 13.3921f, 13.5604f, 13.9085f)
        lineTo(13.5243f, 13.9217f)
        curveTo(13.2108f, 14.0362f, 12.8553f, 14.003f, 12.5997f, 13.7883f)
        curveTo(12.1727f, 13.4295f, 11.844f, 13.0471f, 11.552f, 12.7635f)
        curveTo(10.4941f, 11.8001f, 10.4941f, 11.5296f, 10.4941f, 11.2752f)
        curveTo(10.5554f, 10.2461f, 12.6171f, 6.74924f, 14.3631f, 5.67983f)
        }
        }.build()

        return _handBeater!!
    }

private var _handBeater: ImageVector? = null
