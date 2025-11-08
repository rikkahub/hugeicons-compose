package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = ImageVector.Builder(
            name = "Auction",
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
        moveTo(12f, 14.0059f)
        lineTo(5.84373f, 21.2328f)
        curveTo(5.01764f, 22.2026f, 3.54001f, 22.2616f, 2.63922f, 21.3608f)
        curveTo(1.73843f, 20.46f, 1.79744f, 18.9824f, 2.7672f, 18.1563f)
        lineTo(9.99412f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 11.9048f)
        lineTo(15.9048f, 18f)
        moveTo(12.0952f, 2f)
        lineTo(6f, 8.09524f)
        moveTo(11.3334f, 2.76186f)
        lineTo(6.76195f, 7.33329f)
        curveTo(6.76195f, 7.33329f, 9.04766f, 10.3809f, 11.3334f, 12.6666f)
        curveTo(13.6191f, 14.9523f, 16.6667f, 17.2381f, 16.6667f, 17.2381f)
        lineTo(21.2381f, 12.6666f)
        curveTo(21.2381f, 12.6666f, 18.9524f, 9.61901f, 16.6667f, 7.33329f)
        curveTo(14.381f, 5.04758f, 11.3334f, 2.76186f, 11.3334f, 2.76186f)
        }
        }.build()

        return _auction!!
    }

private var _auction: ImageVector? = null
