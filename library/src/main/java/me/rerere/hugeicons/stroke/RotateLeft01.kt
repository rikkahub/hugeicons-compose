package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateLeft01: ImageVector
    get() {
        if (_rotateLeft01 != null) {
            return _rotateLeft01!!
        }
        _rotateLeft01 = ImageVector.Builder(
            name = "RotateLeft01",
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
        moveTo(20.0071f, 14.5662f)
        lineTo(19.3587f, 14.1731f)
        curveTo(18.7986f, 13.8508f, 18.3579f, 13.3564f, 18.102f, 12.7634f)
        lineTo(15.68f, 7.15102f)
        curveTo(15.5927f, 6.94865f, 15.4729f, 6.77988f, 15.328f, 6.64097f)
        curveTo(14.6876f, 6.02689f, 13.5808f, 6.28697f, 13.0432f, 6.99226f)
        curveTo(12.0506f, 8.29448f, 13.3839f, 9.52751f, 13.1022f, 10.6133f)
        lineTo(5.35908f, 6.26089f)
        curveTo(3.55799f, 5.28913f, 2.0024f, 7.87074f, 3.79277f, 9.06333f)
        lineTo(8.37607f, 11.6124f)
        curveTo(7.4934f, 12.765f, 5.25512f, 18.3551f, 8.12341f, 20.0599f)
        curveTo(8.28646f, 20.1568f, 8.4672f, 20.2213f, 8.64852f, 20.2773f)
        curveTo(8.76516f, 20.3134f, 8.88186f, 20.3496f, 8.99761f, 20.3857f)
        curveTo(9.8979f, 20.6667f, 11.6003f, 21.02f, 12.7668f, 20.9182f)
        curveTo(13.9811f, 20.8123f, 14.7421f, 21.4597f, 15.68f, 21.9995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.36184f, 4.96447f)
        curveTo(9.75873f, 5.36011f, 11.4854f, 5.24597f, 12.1223f, 5.16653f)
        moveTo(9.36184f, 4.96447f)
        curveTo(8.96494f, 4.56883f, 8.95358f, 2.63679f, 9.03328f, 2.0019f)
        moveTo(9.36184f, 4.96447f)
        curveTo(10.3829f, 3.19624f, 14.4425f, 0.375691f, 18.4708f, 3.19624f)
        curveTo(20.4175f, 4.55924f, 20.6922f, 5.4182f, 21f, 5.99362f)
        }
        }.build()

        return _rotateLeft01!!
    }

private var _rotateLeft01: ImageVector? = null
