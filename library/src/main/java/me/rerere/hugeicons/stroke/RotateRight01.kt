package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateRight01: ImageVector
    get() {
        if (_rotateRight01 != null) {
            return _rotateRight01!!
        }
        _rotateRight01 = ImageVector.Builder(
            name = "RotateRight01",
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
        moveTo(3.97007f, 14.8124f)
        lineTo(4.6194f, 14.4192f)
        curveTo(5.18035f, 14.0967f, 5.62166f, 13.6021f, 5.87794f, 13.0089f)
        lineTo(8.30346f, 7.39389f)
        curveTo(8.39092f, 7.19143f, 8.51089f, 7.02259f, 8.65596f, 6.88362f)
        curveTo(9.29728f, 6.26925f, 10.4057f, 6.52945f, 10.9441f, 7.23506f)
        curveTo(11.9381f, 8.53788f, 10.6029f, 9.77147f, 10.885f, 10.8578f)
        lineTo(18.6394f, 6.50335f)
        curveTo(20.4431f, 5.53116f, 22.0009f, 8.11395f, 20.208f, 9.30708f)
        lineTo(15.618f, 11.8574f)
        curveTo(16.502f, 13.0104f, 18.7435f, 18.6031f, 15.871f, 20.3087f)
        curveTo(15.7077f, 20.4056f, 15.5268f, 20.4701f, 15.3452f, 20.5262f)
        curveTo(15.2284f, 20.5622f, 15.1115f, 20.5985f, 14.9956f, 20.6347f)
        curveTo(14.094f, 20.9157f, 12.3891f, 21.2692f, 11.2209f, 21.1674f)
        curveTo(10.0048f, 21.0614f, 9.24274f, 21.7091f, 8.30349f, 22.2491f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.6474f, 4.72061f)
        curveTo(14.2501f, 5.11704f, 12.5218f, 5.00267f, 11.8843f, 4.92307f)
        moveTo(14.6474f, 4.72061f)
        curveTo(15.0446f, 4.32417f, 15.056f, 2.38825f, 14.9762f, 1.75209f)
        moveTo(14.6474f, 4.72061f)
        curveTo(13.6253f, 2.94883f, 9.56188f, 0.122614f, 5.52965f, 2.94883f)
        curveTo(3.58112f, 4.31456f, 3.30617f, 5.17524f, 2.99803f, 5.75183f)
        }
        }.build()

        return _rotateRight01!!
    }

private var _rotateRight01: ImageVector? = null
