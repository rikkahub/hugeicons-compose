package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3rdBracketSquare: ImageVector
    get() {
        if (_icon3rdBracketSquare != null) {
            return _icon3rdBracketSquare!!
        }
        _icon3rdBracketSquare = ImageVector.Builder(
            name = "Icon3rdBracketSquare",
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
        moveTo(14f, 16f)
        curveTo(14.9241f, 16f, 15.6733f, 15.4883f, 15.6733f, 14.8571f)
        curveTo(15.6733f, 13.6365f, 15.6869f, 13.1336f, 16.755f, 12.4041f)
        curveTo(17.0817f, 12.1809f, 17.0817f, 11.8191f, 16.755f, 11.5959f)
        curveTo(15.6869f, 10.8664f, 15.6733f, 10.3635f, 15.6733f, 9.14286f)
        curveTo(15.6733f, 8.51167f, 14.9241f, 8f, 14f, 8f)
        moveTo(10f, 16f)
        curveTo(9.07588f, 16f, 8.32673f, 15.4883f, 8.32673f, 14.8571f)
        curveTo(8.32673f, 13.6365f, 8.31312f, 13.1336f, 7.24505f, 12.4041f)
        curveTo(6.91832f, 12.1809f, 6.91832f, 11.8191f, 7.24504f, 11.5959f)
        curveTo(8.31312f, 10.8664f, 8.32673f, 10.3635f, 8.32673f, 9.14286f)
        curveTo(8.32673f, 8.51167f, 9.07588f, 8f, 10f, 8f)
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

        return _icon3rdBracketSquare!!
    }

private var _icon3rdBracketSquare: ImageVector? = null
