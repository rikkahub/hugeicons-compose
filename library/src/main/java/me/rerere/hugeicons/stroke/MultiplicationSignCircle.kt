package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MultiplicationSignCircle: ImageVector
    get() {
        if (_multiplicationSignCircle != null) {
            return _multiplicationSignCircle!!
        }
        _multiplicationSignCircle = ImageVector.Builder(
            name = "MultiplicationSignCircle",
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
        moveTo(15.5f, 8.5f)
        lineTo(12f, 12f)
        moveTo(12f, 12f)
        lineTo(8.5f, 15.5f)
        moveTo(12f, 12f)
        lineTo(15.5f, 15.5f)
        moveTo(12f, 12f)
        lineTo(8.5f, 8.5f)
        }
        }.build()

        return _multiplicationSignCircle!!
    }

private var _multiplicationSignCircle: ImageVector? = null
