package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ResizeField: ImageVector
    get() {
        if (_resizeField != null) {
            return _resizeField!!
        }
        _resizeField = ImageVector.Builder(
            name = "ResizeField",
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
        moveTo(16f, 18.0002f)
        lineTo(18f, 16.0002f)
        moveTo(11f, 18.0002f)
        lineTo(18f, 11.0002f)
        moveTo(6f, 18f)
        lineTo(18f, 6f)
        }
        }.build()

        return _resizeField!!
    }

private var _resizeField: ImageVector? = null
