package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TabletPen: ImageVector
    get() {
        if (_tabletPen != null) {
            return _tabletPen!!
        }
        _tabletPen = ImageVector.Builder(
            name = "TabletPen",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.31802f, 4.31802f)
        curveTo(4.63604f, 3f, 6.75736f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(17.2426f, 3f, 19.364f, 3f, 20.682f, 4.31802f)
        curveTo(22f, 5.63604f, 22f, 7.75736f, 22f, 12f)
        curveTo(22f, 16.2426f, 22f, 18.364f, 20.682f, 19.682f)
        curveTo(19.364f, 21f, 17.2426f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(6.75736f, 21f, 4.63604f, 21f, 3.31802f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0058f, 8.88441f)
        lineTo(17.614f, 9.49021f)
        curveTo(18.1286f, 10.0028f, 18.1286f, 10.8338f, 17.6141f, 11.3463f)
        lineTo(14.4275f, 14.5799f)
        curveTo(14.1768f, 14.8296f, 13.8561f, 14.9979f, 13.5077f, 15.0627f)
        lineTo(11.5327f, 15.4898f)
        curveTo(11.2209f, 15.5572f, 10.9432f, 15.2814f, 11.01f, 14.9706f)
        lineTo(11.4304f, 13.0148f)
        curveTo(11.4955f, 12.6677f, 11.6645f, 12.3483f, 11.9151f, 12.0987f)
        lineTo(15.1423f, 8.88441f)
        curveTo(15.6569f, 8.37186f, 16.4912f, 8.37186f, 17.0058f, 8.88441f)
        }
        }.build()

        return _tabletPen!!
    }

private var _tabletPen: ImageVector? = null
