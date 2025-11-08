package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3rdBracketCircle: ImageVector
    get() {
        if (_icon3rdBracketCircle != null) {
            return _icon3rdBracketCircle!!
        }
        _icon3rdBracketCircle = ImageVector.Builder(
            name = "Icon3rdBracketCircle",
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
        }.build()

        return _icon3rdBracketCircle!!
    }

private var _icon3rdBracketCircle: ImageVector? = null
