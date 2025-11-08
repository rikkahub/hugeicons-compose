package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WattpadSquare: ImageVector
    get() {
        if (_wattpadSquare != null) {
            return _wattpadSquare!!
        }
        _wattpadSquare = ImageVector.Builder(
            name = "WattpadSquare",
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
        moveTo(8.51991f, 8.70869f)
        curveTo(9.48019f, 9.16088f, 9.32015f, 10.4044f, 9.12009f, 10.9697f)
        curveTo(10.3504f, 8.58748f, 13.8307f, 6.02163f, 13.8307f, 10.2981f)
        curveTo(14.1319f, 9.8178f, 15.0354f, 8.74285f, 16.2401f, 8.28571f)
        curveTo(17.7461f, 7.71428f, 18.8745f, 8.85714f, 17.078f, 10.5714f)
        curveTo(17.078f, 10.5714f, 16.1798f, 11.4286f, 15.2816f, 13.1429f)
        curveTo(14.3834f, 14.8571f, 11.9881f, 16.5714f, 11.2205f, 12.6651f)
        curveTo(9.11986f, 17.7523f, 6.71939f, 16.3394f, 6.11921f, 12.948f)
        curveTo(5.51904f, 9.55655f, 7.31956f, 8.14345f, 8.51991f, 8.70869f)
        }

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
        }.build()

        return _wattpadSquare!!
    }

private var _wattpadSquare: ImageVector? = null
