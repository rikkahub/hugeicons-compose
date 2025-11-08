package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlusMinusCircle02: ImageVector
    get() {
        if (_plusMinusCircle02 != null) {
            return _plusMinusCircle02!!
        }
        _plusMinusCircle02 = ImageVector.Builder(
            name = "PlusMinusCircle02",
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
        moveTo(8f, 16f)
        lineTo(16f, 8f)
        moveTo(9.5f, 8f)
        lineTo(9.5f, 9.5f)
        moveTo(9.5f, 9.5f)
        lineTo(9.5f, 11f)
        moveTo(9.5f, 9.5f)
        lineTo(11f, 9.5f)
        moveTo(9.5f, 9.5f)
        lineTo(8f, 9.5f)
        moveTo(16f, 14.5f)
        lineTo(13f, 14.5f)
        }
        }.build()

        return _plusMinusCircle02!!
    }

private var _plusMinusCircle02: ImageVector? = null
