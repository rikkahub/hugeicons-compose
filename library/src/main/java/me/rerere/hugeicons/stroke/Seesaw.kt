package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Seesaw: ImageVector
    get() {
        if (_seesaw != null) {
            return _seesaw!!
        }
        _seesaw = ImageVector.Builder(
            name = "Seesaw",
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
        moveTo(8f, 17f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 17f)
        verticalLineTo(12f)
        moveTo(10.5f, 13f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9036f, 5.63607f)
        lineTo(17.3268f, 5.3184f)
        moveTo(17.3268f, 5.3184f)
        lineTo(18.75f, 5.00073f)
        moveTo(17.3268f, 5.3184f)
        lineTo(17.9839f, 8.07033f)
        moveTo(3.56943f, 8.38917f)
        lineTo(4.9926f, 8.07151f)
        moveTo(4.9926f, 8.07151f)
        lineTo(6.41578f, 7.75384f)
        moveTo(4.9926f, 8.07151f)
        lineTo(5.64974f, 10.8234f)
        moveTo(2.56619f, 11.5117f)
        lineTo(21.0675f, 7.38205f)
        curveTo(21.4605f, 7.29433f, 21.8526f, 7.53124f, 21.9434f, 7.9112f)
        curveTo(22.2156f, 9.05108f, 21.4804f, 10.1885f, 20.3014f, 10.4516f)
        lineTo(4.6465f, 13.946f)
        curveTo(3.4675f, 14.2091f, 2.29107f, 13.4984f, 2.01888f, 12.3585f)
        curveTo(1.92815f, 11.9786f, 2.17319f, 11.5994f, 2.56619f, 11.5117f)
        }
        }.build()

        return _seesaw!!
    }

private var _seesaw: ImageVector? = null
