package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = ImageVector.Builder(
            name = "Text",
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
        moveTo(15f, 21.001f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.00001f)
        verticalLineTo(21.0008f)
        moveTo(12f, 3.00001f)
        curveTo(13.3874f, 3.00001f, 15.1695f, 3.03055f, 16.5884f, 3.17649f)
        curveTo(17.1885f, 3.2382f, 17.4886f, 3.26906f, 17.7541f, 3.37791f)
        curveTo(18.3066f, 3.60429f, 18.7518f, 4.10063f, 18.9194f, 4.67681f)
        curveTo(19f, 4.95382f, 19f, 5.26992f, 19f, 5.90215f)
        moveTo(12f, 3.00001f)
        curveTo(10.6126f, 3.00001f, 8.83047f, 3.03055f, 7.41161f, 3.17649f)
        curveTo(6.8115f, 3.2382f, 6.51144f, 3.26906f, 6.24586f, 3.37791f)
        curveTo(5.69344f, 3.60429f, 5.24816f, 4.10063f, 5.08057f, 4.67681f)
        curveTo(5f, 4.95382f, 5f, 5.26992f, 5f, 5.90215f)
        }
        }.build()

        return _text!!
    }

private var _text: ImageVector? = null
