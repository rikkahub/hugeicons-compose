package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InputCursorText: ImageVector
    get() {
        if (_inputCursorText != null) {
            return _inputCursorText!!
        }
        _inputCursorText = ImageVector.Builder(
            name = "InputCursorText",
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
        moveTo(9f, 6f)
        verticalLineTo(18f)
        moveTo(9f, 6f)
        curveTo(9f, 4.89543f, 9.89543f, 4f, 11f, 4f)
        moveTo(9f, 6f)
        curveTo(9f, 4.89543f, 8.10457f, 4f, 7f, 4f)
        moveTo(9f, 18f)
        curveTo(9f, 19.1046f, 9.89543f, 20f, 11f, 20f)
        moveTo(9f, 18f)
        curveTo(9f, 19.1046f, 8.10457f, 20f, 7f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 8f, 20.8284f, 8f, 21.4142f, 8.58579f)
        curveTo(22f, 9.17157f, 22f, 10.1144f, 22f, 12f)
        curveTo(22f, 13.8856f, 22f, 14.8284f, 21.4142f, 15.4142f)
        curveTo(20.8284f, 16f, 19.8856f, 16f, 18f, 16f)
        horizontalLineTo(12f)
        moveTo(6f, 16f)
        curveTo(4.11438f, 16f, 3.17157f, 16f, 2.58579f, 15.4142f)
        curveTo(2f, 14.8284f, 2f, 13.8856f, 2f, 12f)
        curveTo(2f, 10.1144f, 2f, 9.17157f, 2.58579f, 8.58579f)
        curveTo(3.17157f, 8f, 4.11438f, 8f, 6f, 8f)
        }
        }.build()

        return _inputCursorText!!
    }

private var _inputCursorText: ImageVector? = null
