package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorText: ImageVector
    get() {
        if (_cursorText != null) {
            return _cursorText!!
        }
        _cursorText = ImageVector.Builder(
            name = "CursorText",
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
        moveTo(13f, 17f)
        lineTo(11.0714f, 12.5f)
        moveTo(3f, 17f)
        lineTo(4.92857f, 12.5f)
        moveTo(4.92857f, 12.5f)
        lineTo(7.02295f, 7.61311f)
        curveTo(7.21207f, 7.17183f, 7.54728f, 7f, 8f, 7f)
        curveTo(8.45272f, 7f, 8.78793f, 7.17183f, 8.97705f, 7.61311f)
        lineTo(11.0714f, 12.5f)
        moveTo(4.92857f, 12.5f)
        horizontalLineTo(11.0714f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3.00008f)
        curveTo(16.8333f, 2.99261f, 18f, 3.50003f, 18.5f, 4.50003f)
        moveTo(18.5f, 4.50003f)
        curveTo(19f, 3.50003f, 20.1667f, 3.00005f, 21f, 3.00008f)
        moveTo(18.5f, 4.50003f)
        lineTo(18.5f, 19.5f)
        moveTo(21f, 21f)
        curveTo(20.1667f, 21.0074f, 19f, 20.5f, 18.5f, 19.5f)
        moveTo(18.5f, 19.5f)
        curveTo(18f, 20.5f, 16.8333f, 21f, 16f, 21f)
        moveTo(20f, 12f)
        horizontalLineTo(17f)
        }
        }.build()

        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
