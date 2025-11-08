package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon2ndBracket: ImageVector
    get() {
        if (_icon2ndBracket != null) {
            return _icon2ndBracket!!
        }
        _icon2ndBracket = ImageVector.Builder(
            name = "Icon2ndBracket",
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
        moveTo(17.225f, 3f)
        curveTo(18.6145f, 3.15381f, 19.5498f, 3.50143f, 20.2479f, 4.28705f)
        curveTo(21.5f, 5.69617f, 21.5f, 7.96411f, 21.5f, 12.5f)
        curveTo(21.5f, 17.0359f, 21.5f, 19.3038f, 20.2479f, 20.713f)
        curveTo(19.5498f, 21.4986f, 18.6145f, 21.8462f, 17.225f, 22f)
        moveTo(6.77501f, 22f)
        curveTo(5.38551f, 21.8462f, 4.45021f, 21.4986f, 3.75212f, 20.713f)
        curveTo(2.5f, 19.3038f, 2.5f, 17.0359f, 2.5f, 12.5f)
        curveTo(2.5f, 7.96411f, 2.5f, 5.69617f, 3.75212f, 4.28705f)
        curveTo(4.45021f, 3.50143f, 5.38551f, 3.15381f, 6.77501f, 3f)
        }
        }.build()

        return _icon2ndBracket!!
    }

private var _icon2ndBracket: ImageVector? = null
