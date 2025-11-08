package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextSelection: ImageVector
    get() {
        if (_textSelection != null) {
            return _textSelection!!
        }
        _textSelection = ImageVector.Builder(
            name = "TextSelection",
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
        moveTo(2.99792f, 3.02212f)
        curveTo(5.19555f, 2.97f, 6.26962f, 2.90514f, 6.99792f, 4.51533f)
        moveTo(6.99792f, 4.51533f)
        curveTo(7.55517f, 3.2634f, 8.38712f, 2.90727f, 10.9979f, 3.02212f)
        moveTo(6.99792f, 4.51533f)
        verticalLineTo(18.9497f)
        moveTo(6.99792f, 18.9497f)
        curveTo(7.22891f, 20.6878f, 8.13357f, 21.1034f, 10.9979f, 20.9406f)
        moveTo(6.99792f, 18.9497f)
        curveTo(6.6944f, 20.7313f, 5.77226f, 21.1738f, 2.99792f, 20.9406f)
        moveTo(3.99792f, 11.9814f)
        horizontalLineTo(9.99792f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9698f, 15.9631f)
        verticalLineTo(20.4428f)
        moveTo(20.9698f, 15.9631f)
        curveTo(21.017f, 15.1437f, 21.0187f, 14.5196f, 20.92f, 14.0101f)
        curveTo(20.6874f, 12.8091f, 19.4287f, 12.0854f, 18.2108f, 11.9382f)
        curveTo(17.0451f, 11.7973f, 16.1094f, 12.0965f, 15.1629f, 13.4715f)
        moveTo(20.9698f, 15.9631f)
        lineTo(18.1305f, 15.9631f)
        curveTo(17.6943f, 15.9631f, 17.2543f, 15.9841f, 16.834f, 16.1006f)
        curveTo(14.2653f, 16.8125f, 14.4536f, 20.404f, 17.0299f, 20.8467f)
        curveTo(17.316f, 20.8959f, 17.6082f, 20.9169f, 17.8979f, 20.904f)
        curveTo(18.5745f, 20.8739f, 19.1988f, 20.5481f, 19.7345f, 20.135f)
        curveTo(20.3621f, 19.6511f, 20.9698f, 18.9757f, 20.9698f, 17.9541f)
        verticalLineTo(15.9631f)
        }
        }.build()

        return _textSelection!!
    }

private var _textSelection: ImageVector? = null
