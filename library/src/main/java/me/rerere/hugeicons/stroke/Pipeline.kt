package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pipeline: ImageVector
    get() {
        if (_pipeline != null) {
            return _pipeline!!
        }
        _pipeline = ImageVector.Builder(
            name = "Pipeline",
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
        moveTo(16.2498f, 16.4334f)
        curveTo(14.3307f, 19.4778f, 13.3712f, 21f, 12f, 21f)
        curveTo(10.6288f, 21f, 9.66926f, 19.4778f, 7.75025f, 16.4334f)
        lineTo(5.50587f, 12.8729f)
        curveTo(2.76382f, 8.5228f, 1.3928f, 6.34777f, 2.25742f, 4.67388f)
        curveTo(3.12205f, 3f, 5.61655f, 3f, 10.6056f, 3f)
        lineTo(13.3944f, 3f)
        curveTo(18.3834f, 3f, 20.878f, 3f, 21.7426f, 4.67389f)
        curveTo(22.6072f, 6.34777f, 21.2362f, 8.5228f, 18.4941f, 12.8729f)
        lineTo(16.2498f, 16.4334f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 9f)
        lineTo(3f, 9f)
        moveTo(17.1818f, 15f)
        lineTo(7f, 15f)
        }
        }.build()

        return _pipeline!!
    }

private var _pipeline: ImageVector? = null
