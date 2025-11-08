package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RouteBlock: ImageVector
    get() {
        if (_routeBlock != null) {
            return _routeBlock!!
        }
        _routeBlock = ImageVector.Builder(
            name = "RouteBlock",
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
        moveTo(15f, 2f)
        lineTo(21f, 8f)
        moveTo(21f, 2f)
        lineTo(15f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        horizontalLineTo(8.5f)
        curveTo(6.567f, 5f, 5f, 6.567f, 5f, 8.5f)
        curveTo(5f, 10.433f, 6.567f, 12f, 8.5f, 12f)
        horizontalLineTo(15.5f)
        curveTo(17.433f, 12f, 19f, 13.567f, 19f, 15.5f)
        curveTo(19f, 17.433f, 17.433f, 19f, 15.5f, 19f)
        horizontalLineTo(12f)
        }
        }.build()

        return _routeBlock!!
    }

private var _routeBlock: ImageVector? = null
