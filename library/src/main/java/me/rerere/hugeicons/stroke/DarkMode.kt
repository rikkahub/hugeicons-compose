package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DarkMode: ImageVector
    get() {
        if (_darkMode != null) {
            return _darkMode!!
        }
        _darkMode = ImageVector.Builder(
            name = "DarkMode",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5227f, 17.5229f, 22f, 12f, 22f)
        curveTo(6.47713f, 22f, 2f, 17.5227f, 2f, 12f)
        curveTo(2f, 6.47713f, 6.47713f, 2f, 12f, 2f)
        curveTo(17.5229f, 2f, 22f, 6.47713f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 12f)
        curveTo(16.5f, 14.4852f, 14.4853f, 16.5f, 12f, 16.5f)
        curveTo(9.51471f, 16.5f, 7.5f, 14.4852f, 7.5f, 12f)
        curveTo(7.5f, 9.51471f, 9.51471f, 7.5f, 12f, 7.5f)
        curveTo(14.4853f, 7.5f, 16.5f, 9.51471f, 16.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }
        }.build()

        return _darkMode!!
    }

private var _darkMode: ImageVector? = null
