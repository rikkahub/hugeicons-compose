package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotEqualSignCircle: ImageVector
    get() {
        if (_notEqualSignCircle != null) {
            return _notEqualSignCircle!!
        }
        _notEqualSignCircle = ImageVector.Builder(
            name = "NotEqualSignCircle",
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
        moveTo(7f, 9.77778f)
        horizontalLineTo(17f)
        moveTo(7f, 14.2222f)
        horizontalLineTo(17f)
        moveTo(8.66667f, 17f)
        lineTo(15.3333f, 7f)
        }
        }.build()

        return _notEqualSignCircle!!
    }

private var _notEqualSignCircle: ImageVector? = null
