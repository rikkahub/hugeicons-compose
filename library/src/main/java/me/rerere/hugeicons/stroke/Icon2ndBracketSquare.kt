package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon2ndBracketSquare: ImageVector
    get() {
        if (_icon2ndBracketSquare != null) {
            return _icon2ndBracketSquare!!
        }
        _icon2ndBracketSquare = ImageVector.Builder(
            name = "Icon2ndBracketSquare",
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
        moveTo(15f, 8f)
        curveTo(15.6501f, 8.06476f, 16.0876f, 8.21113f, 16.4142f, 8.54192f)
        curveTo(17f, 9.13523f, 17f, 10.0902f, 17f, 12f)
        curveTo(17f, 13.9098f, 17f, 14.8648f, 16.4142f, 15.4581f)
        curveTo(16.0876f, 15.7889f, 15.6501f, 15.9352f, 15f, 16f)
        moveTo(9f, 16f)
        curveTo(8.34994f, 15.9352f, 7.91238f, 15.7889f, 7.58579f, 15.4581f)
        curveTo(7f, 14.8648f, 7f, 13.9098f, 7f, 12f)
        curveTo(7f, 10.0902f, 7f, 9.13523f, 7.58579f, 8.54192f)
        curveTo(7.91238f, 8.21113f, 8.34994f, 8.06476f, 9f, 8f)
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

        return _icon2ndBracketSquare!!
    }

private var _icon2ndBracketSquare: ImageVector? = null
