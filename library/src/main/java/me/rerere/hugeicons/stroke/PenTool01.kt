package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenTool01: ImageVector
    get() {
        if (_penTool01 != null) {
            return _penTool01!!
        }
        _penTool01 = ImageVector.Builder(
            name = "PenTool01",
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
        moveTo(6.5f, 20.5f)
        lineTo(7.90613f, 15.227f)
        curveTo(8.19164f, 14.1564f, 8.33439f, 13.621f, 8.73856f, 13.3105f)
        curveTo(9.14274f, 13f, 9.69677f, 13f, 10.8048f, 13f)
        horizontalLineTo(13.1952f)
        curveTo(14.3032f, 13f, 14.8573f, 13f, 15.2614f, 13.3105f)
        curveTo(15.6656f, 13.621f, 15.8084f, 14.1564f, 16.0939f, 15.227f)
        lineTo(17.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 13f)
        lineTo(11.0769f, 9.36095f)
        curveTo(11.4701f, 8.45365f, 11.6667f, 8f, 12f, 8f)
        curveTo(12.3333f, 8f, 12.5299f, 8.45365f, 12.9231f, 9.36095f)
        lineTo(14.5f, 13f)
        }
        }.build()

        return _penTool01!!
    }

private var _penTool01: ImageVector? = null
