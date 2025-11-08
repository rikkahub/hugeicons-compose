package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Molecules: ImageVector
    get() {
        if (_molecules != null) {
            return _molecules!!
        }
        _molecules = ImageVector.Builder(
            name = "Molecules",
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
        moveTo(12f, 9f)
        verticalLineTo(6f)
        moveTo(18.5f, 18.5f)
        lineTo(15f, 16f)
        moveTo(5.5f, 18.5f)
        lineTo(9f, 16f)
        }
        }.build()

        return _molecules!!
    }

private var _molecules: ImageVector? = null
