package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Undo02: ImageVector
    get() {
        if (_undo02 != null) {
            return _undo02!!
        }
        _undo02 = ImageVector.Builder(
            name = "Undo02",
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
        moveTo(12f, 21f)
        curveTo(16.9706f, 21f, 21f, 16.9706f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(8.66873f, 3f, 5.76018f, 4.80989f, 4.20404f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        verticalLineTo(4.27816f)
        curveTo(3f, 6.47004f, 3f, 7.56599f, 3.70725f, 8.16512f)
        curveTo(4.4145f, 8.76425f, 5.49553f, 8.58408f, 7.6576f, 8.22373f)
        lineTo(9f, 8f)
        }
        }.build()

        return _undo02!!
    }

private var _undo02: ImageVector? = null
