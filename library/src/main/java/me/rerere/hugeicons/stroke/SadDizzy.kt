package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SadDizzy: ImageVector
    get() {
        if (_sadDizzy != null) {
            return _sadDizzy!!
        }
        _sadDizzy = ImageVector.Builder(
            name = "SadDizzy",
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
        moveTo(10f, 11f)
        lineTo(8.5f, 9.5f)
        moveTo(8.5f, 9.5f)
        lineTo(7f, 8f)
        moveTo(8.5f, 9.5f)
        lineTo(7f, 11f)
        moveTo(8.5f, 9.5f)
        lineTo(10f, 8f)
        moveTo(17f, 11f)
        lineTo(15.5f, 9.5f)
        moveTo(15.5f, 9.5f)
        lineTo(14f, 8f)
        moveTo(15.5f, 9.5f)
        lineTo(14f, 11f)
        moveTo(15.5f, 9.5f)
        lineTo(17f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        curveTo(8.91212f, 15.7856f, 10.3643f, 15f, 12f, 15f)
        curveTo(13.6357f, 15f, 15.0879f, 15.7856f, 16f, 17f)
        }
        }.build()

        return _sadDizzy!!
    }

private var _sadDizzy: ImageVector? = null
