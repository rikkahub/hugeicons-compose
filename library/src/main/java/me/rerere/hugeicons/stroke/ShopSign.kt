package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShopSign: ImageVector
    get() {
        if (_shopSign != null) {
            return _shopSign!!
        }
        _shopSign = ImageVector.Builder(
            name = "ShopSign",
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
        moveTo(7.07007f, 2.5f)
        horizontalLineTo(15.7559f)
        curveTo(16.9383f, 2.5f, 17.5295f, 2.5f, 17.9484f, 2.8352f)
        curveTo(18.3673f, 3.1704f, 18.4891f, 3.74092f, 18.7327f, 4.88197f)
        lineTo(21.7654f, 19.088f)
        curveTo(22.0033f, 20.2028f, 22.1223f, 20.7602f, 21.818f, 21.1301f)
        curveTo(21.5136f, 21.5f, 20.936f, 21.5f, 19.7808f, 21.5f)
        horizontalLineTo(13.2369f)
        curveTo(12.4673f, 21.5f, 12.0825f, 21.5f, 11.806f, 21.2844f)
        curveTo(11.5296f, 21.0687f, 11.4409f, 20.6995f, 11.2635f, 19.9609f)
        lineTo(7.07007f, 2.5f)
        moveTo(7.07007f, 2.5f)
        lineTo(2f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16f)
        horizontalLineTo(10f)
        }
        }.build()

        return _shopSign!!
    }

private var _shopSign: ImageVector? = null
