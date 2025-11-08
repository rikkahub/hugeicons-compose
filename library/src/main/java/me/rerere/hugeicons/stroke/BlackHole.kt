package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BlackHole: ImageVector
    get() {
        if (_blackHole != null) {
            return _blackHole!!
        }
        _blackHole = ImageVector.Builder(
            name = "BlackHole",
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
        moveTo(20.5f, 5f)
        curveTo(21.3284f, 5f, 22f, 4.32843f, 22f, 3.5f)
        curveTo(22f, 2.67157f, 21.3284f, 2f, 20.5f, 2f)
        curveTo(19.6716f, 2f, 19f, 2.67157f, 19f, 3.5f)
        curveTo(19f, 4.32843f, 19.6716f, 5f, 20.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 22f)
        curveTo(4.32843f, 22f, 5f, 21.3284f, 5f, 20.5f)
        curveTo(5f, 19.6716f, 4.32843f, 19f, 3.5f, 19f)
        curveTo(2.67157f, 19f, 2f, 19.6716f, 2f, 20.5f)
        curveTo(2f, 21.3284f, 2.67157f, 22f, 3.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0385f, 13.0623f)
        curveTo(21.6076f, 12.9268f, 22f, 12.4933f, 22f, 12f)
        curveTo(22f, 11.5067f, 21.6076f, 11.0732f, 21.0385f, 10.9377f)
        lineTo(16.5212f, 9.8622f)
        curveTo(15.7198f, 8.17022f, 13.9966f, 7f, 12f, 7f)
        curveTo(10.0034f, 7f, 8.28021f, 8.17023f, 7.47877f, 9.8622f)
        lineTo(2.96152f, 10.9377f)
        curveTo(2.39239f, 11.0732f, 2f, 11.5067f, 2f, 12f)
        curveTo(2f, 12.4933f, 2.39239f, 12.9268f, 2.96152f, 13.0623f)
        lineTo(7.47877f, 14.1378f)
        curveTo(8.28021f, 15.8298f, 10.0034f, 17f, 12f, 17f)
        curveTo(13.9966f, 17f, 15.7198f, 15.8298f, 16.5212f, 14.1378f)
        lineTo(21.0385f, 13.0623f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        curveTo(13.1046f, 14f, 14f, 13.1046f, 14f, 12f)
        curveTo(14f, 10.8954f, 13.1046f, 10f, 12f, 10f)
        curveTo(10.8954f, 10f, 10f, 10.8954f, 10f, 12f)
        curveTo(10f, 13.1046f, 10.8954f, 14f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0007f, 2.4578f)
        curveTo(14.0537f, 2.16035f, 13.0459f, 2f, 12.0007f, 2f)
        curveTo(8.7291f, 2f, 5.82441f, 3.57111f, 4f, 6f)
        moveTo(9.00073f, 21.5422f)
        curveTo(9.94777f, 21.8396f, 10.9555f, 22f, 12.0007f, 22f)
        curveTo(15.2719f, 22f, 18.1763f, 20.4293f, 20.0007f, 18.001f)
        }
        }.build()

        return _blackHole!!
    }

private var _blackHole: ImageVector? = null
