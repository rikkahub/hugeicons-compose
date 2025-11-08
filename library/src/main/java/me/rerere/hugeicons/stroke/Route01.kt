package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Route01: ImageVector
    get() {
        if (_route01 != null) {
            return _route01!!
        }
        _route01 = ImageVector.Builder(
            name = "Route01",
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

        return _route01!!
    }

private var _route01: ImageVector? = null
