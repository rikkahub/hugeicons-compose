package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quote: ImageVector
    get() {
        if (_quote != null) {
            return _quote!!
        }
        _quote = ImageVector.Builder(
            name = "Quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(17.9922f, 5.75f)
            curveTo(20.2013f, 5.75f, 21.9922f, 7.63509f, 21.9922f, 9.96101f)
            curveTo(21.9922f, 13.0258f, 20.5783f, 15.7433f, 18.3998f, 17.4295f)
            curveTo(17.6167f, 18.0357f, 17.2252f, 18.3387f, 16.9588f, 18.2272f)
            curveTo(16.8775f, 18.1932f, 16.8045f, 18.1362f, 16.7514f, 18.0654f)
            curveTo(16.5774f, 17.8331f, 16.8036f, 17.2896f, 17.2561f, 16.2028f)
            curveTo(17.5006f, 15.6154f, 17.6228f, 15.3217f, 17.5771f, 15.0357f)
            curveTo(17.5587f, 14.9206f, 17.5428f, 14.8689f, 17.4933f, 14.7636f)
            curveTo(17.3704f, 14.5018f, 16.8808f, 14.1853f, 15.9018f, 13.5523f)
            curveTo(14.7562f, 12.8116f, 13.9922f, 11.4802f, 13.9922f, 9.96101f)
            curveTo(13.9922f, 8.47071f, 14.7273f, 7.16135f, 15.8366f, 6.41291f)
            curveTo(16.4587f, 5.99345f, 17.1985f, 5.75f, 17.9922f, 5.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.99219f, 5.75f)
            curveTo(8.20132f, 5.75f, 9.99219f, 7.63509f, 9.99219f, 9.96101f)
            curveTo(9.99219f, 13.0258f, 8.57833f, 15.7433f, 6.39979f, 17.4295f)
            curveTo(5.61672f, 18.0357f, 5.22518f, 18.3387f, 4.95877f, 18.2272f)
            curveTo(4.87752f, 18.1932f, 4.80451f, 18.1362f, 4.75143f, 18.0654f)
            curveTo(4.57737f, 17.8331f, 4.8036f, 17.2896f, 5.25607f, 16.2028f)
            curveTo(5.50059f, 15.6154f, 5.62285f, 15.3217f, 5.57711f, 15.0357f)
            curveTo(5.55871f, 14.9206f, 5.54279f, 14.8689f, 5.49331f, 14.7636f)
            curveTo(5.37036f, 14.5018f, 4.88084f, 14.1853f, 3.9018f, 13.5523f)
            curveTo(2.75622f, 12.8116f, 1.99219f, 11.4802f, 1.99219f, 9.96101f)
            curveTo(1.99219f, 8.47071f, 2.72729f, 7.16135f, 3.83662f, 6.41291f)
            curveTo(4.45869f, 5.99345f, 5.19849f, 5.75f, 5.99219f, 5.75f)
            close()
        }
        }.build()

        return _quote!!
    }

private var _quote: ImageVector? = null
