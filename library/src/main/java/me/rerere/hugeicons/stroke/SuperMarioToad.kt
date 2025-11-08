package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SuperMarioToad: ImageVector
    get() {
        if (_superMarioToad != null) {
            return _superMarioToad!!
        }
        _superMarioToad = ImageVector.Builder(
            name = "SuperMarioToad",
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
        moveTo(5.00779f, 16.7056f)
        curveTo(4.97141f, 16.3269f, 5.05697f, 16.1715f, 5.38146f, 15.9558f)
        curveTo(9.30933f, 13.3451f, 15.6755f, 13.3481f, 18.7181f, 15.9646f)
        curveTo(18.9566f, 16.1696f, 19.0195f, 16.3169f, 18.9951f, 16.6236f)
        curveTo(18.8758f, 18.1215f, 18.471f, 19.8517f, 17.2149f, 20.8332f)
        curveTo(15.2211f, 22.3912f, 8.76892f, 22.3867f, 6.78076f, 20.8332f)
        curveTo(5.53838f, 19.8624f, 5.14963f, 18.182f, 5.00779f, 16.7056f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00896f, 18f)
        horizontalLineTo(9f)
        moveTo(15f, 18f)
        horizontalLineTo(14.991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        curveTo(3f, 17f, 2f, 14.2512f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 14.2512f, 21f, 17f, 19f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.36963f, 7f)
        curveTo(4.66856f, 7.31423f, 5.32655f, 8.8999f, 4.83928f, 10.5417f)
        curveTo(4.40097f, 12.0185f, 3.18529f, 13.0377f, 2f, 12.9989f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.6315f, 7f)
        curveTo(19.3317f, 7.31423f, 18.6732f, 8.8999f, 19.1608f, 10.5417f)
        curveTo(19.5992f, 12.0177f, 20.8145f, 13.0366f, 22f, 12.999f)
        }
        }.build()

        return _superMarioToad!!
    }

private var _superMarioToad: ImageVector? = null
