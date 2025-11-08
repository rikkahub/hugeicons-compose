package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EqualSignCircle: ImageVector
    get() {
        if (_equalSignCircle != null) {
            return _equalSignCircle!!
        }
        _equalSignCircle = ImageVector.Builder(
            name = "EqualSignCircle",
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
        moveTo(8f, 9f)
        horizontalLineTo(16f)
        moveTo(8f, 15f)
        horizontalLineTo(16f)
        }
        }.build()

        return _equalSignCircle!!
    }

private var _equalSignCircle: ImageVector? = null
