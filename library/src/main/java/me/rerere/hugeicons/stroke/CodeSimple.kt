package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = ImageVector.Builder(
            name = "CodeSimple",
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
        moveTo(8f, 6f)
        lineTo(4.32038f, 9.17157f)
        curveTo(2.77346f, 10.5049f, 2f, 11.1716f, 2f, 12f)
        curveTo(2f, 12.8284f, 2.77346f, 13.4951f, 4.32038f, 14.8284f)
        lineTo(8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        lineTo(19.6796f, 9.17157f)
        curveTo(21.2265f, 10.5049f, 22f, 11.1716f, 22f, 12f)
        curveTo(22f, 12.8284f, 21.2265f, 13.4951f, 19.6796f, 14.8284f)
        lineTo(16f, 18f)
        }
        }.build()

        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
