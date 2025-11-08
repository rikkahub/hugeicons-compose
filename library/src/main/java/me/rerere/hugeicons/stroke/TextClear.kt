package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextClear: ImageVector
    get() {
        if (_textClear != null) {
            return _textClear!!
        }
        _textClear = ImageVector.Builder(
            name = "TextClear",
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
        moveTo(11f, 20.001f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        lineTo(8f, 20.0008f)
        moveTo(12f, 4f)
        curveTo(13.3874f, 4f, 15.1695f, 4.03054f, 16.5884f, 4.17648f)
        curveTo(17.1885f, 4.23819f, 17.4886f, 4.26905f, 17.7541f, 4.37789f)
        curveTo(18.3066f, 4.60428f, 18.7518f, 5.10062f, 18.9194f, 5.6768f)
        curveTo(19f, 5.95381f, 19f, 6.26991f, 19f, 6.90214f)
        moveTo(12f, 4f)
        curveTo(10.6126f, 4f, 8.83047f, 4.03054f, 7.41161f, 4.17648f)
        curveTo(6.8115f, 4.23819f, 6.51144f, 4.26905f, 6.24586f, 4.37789f)
        curveTo(5.69344f, 4.60428f, 5.24816f, 5.10062f, 5.08057f, 5.6768f)
        curveTo(5f, 5.95381f, 5f, 6.26991f, 5f, 6.90214f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 15f)
        lineTo(19f, 20f)
        moveTo(14f, 20f)
        lineTo(19f, 15f)
        }
        }.build()

        return _textClear!!
    }

private var _textClear: ImageVector? = null
