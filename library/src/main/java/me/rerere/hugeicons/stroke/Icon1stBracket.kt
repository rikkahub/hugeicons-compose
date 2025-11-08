package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon1stBracket: ImageVector
    get() {
        if (_icon1stBracket != null) {
            return _icon1stBracket!!
        }
        _icon1stBracket = ImageVector.Builder(
            name = "Icon1stBracket",
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
        moveTo(6f, 3f)
        curveTo(3.58901f, 4.93486f, 2f, 8.24345f, 2f, 12f)
        curveTo(2f, 15.7565f, 3.58901f, 19.0651f, 6f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 3f)
        curveTo(20.411f, 4.93486f, 22f, 8.24345f, 22f, 12f)
        curveTo(22f, 15.7565f, 20.411f, 19.0651f, 18f, 21f)
        }
        }.build()

        return _icon1stBracket!!
    }

private var _icon1stBracket: ImageVector? = null
