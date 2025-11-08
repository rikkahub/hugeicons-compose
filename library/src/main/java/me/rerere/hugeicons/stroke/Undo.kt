package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = ImageVector.Builder(
            name = "Undo",
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
        moveTo(3f, 12f)
        curveTo(3f, 16.9706f, 7.02944f, 21f, 12f, 21f)
        curveTo(16.9706f, 21f, 21f, 16.9706f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(8.79275f, 3f, 5.97733f, 4.67765f, 4.38341f, 7.20327f)
        moveTo(3.29339f, 3.00076f)
        lineTo(3.46556f, 5.05452f)
        curveTo(3.58958f, 6.53384f, 3.65159f, 7.27349f, 4.13359f, 7.68914f)
        curveTo(4.61559f, 8.10479f, 5.32673f, 8.03185f, 6.74899f, 7.88595f)
        lineTo(8.79339f, 7.67625f)
        }
        }.build()

        return _undo!!
    }

private var _undo: ImageVector? = null
