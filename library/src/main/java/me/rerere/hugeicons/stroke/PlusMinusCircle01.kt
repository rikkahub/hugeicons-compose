package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlusMinusCircle01: ImageVector
    get() {
        if (_plusMinusCircle01 != null) {
            return _plusMinusCircle01!!
        }
        _plusMinusCircle01 = ImageVector.Builder(
            name = "PlusMinusCircle01",
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
        moveTo(12f, 7.5f)
        verticalLineTo(13.8636f)
        moveTo(15.5f, 10.6818f)
        horizontalLineTo(8.5f)
        moveTo(15.5f, 16.5f)
        horizontalLineTo(8.5f)
        }
        }.build()

        return _plusMinusCircle01!!
    }

private var _plusMinusCircle01: ImageVector? = null
