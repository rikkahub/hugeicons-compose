package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SodaCan: ImageVector
    get() {
        if (_sodaCan != null) {
            return _sodaCan!!
        }
        _sodaCan = ImageVector.Builder(
            name = "SodaCan",
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
        moveTo(5.92711f, 3.88746f)
        lineTo(6.90031f, 2.71963f)
        curveTo(7.1952f, 2.36576f, 7.34265f, 2.18882f, 7.54422f, 2.09441f)
        curveTo(7.74579f, 2f, 7.97611f, 2f, 8.43675f, 2f)
        horizontalLineTo(15.5633f)
        curveTo(16.0239f, 2f, 16.2542f, 2f, 16.4558f, 2.09441f)
        curveTo(16.6574f, 2.18882f, 16.8048f, 2.36576f, 17.0997f, 2.71963f)
        lineTo(18.0729f, 3.88746f)
        curveTo(18.5317f, 4.43802f, 18.7611f, 4.7133f, 18.8805f, 5.04325f)
        curveTo(19f, 5.3732f, 19f, 5.73153f, 19f, 6.4482f)
        verticalLineTo(17.5518f)
        curveTo(19f, 18.2685f, 19f, 18.6268f, 18.8805f, 18.9568f)
        curveTo(18.7611f, 19.2867f, 18.5317f, 19.562f, 18.0729f, 20.1125f)
        lineTo(16.7998f, 21.6402f)
        curveTo(16.6524f, 21.8171f, 16.5787f, 21.9056f, 16.4779f, 21.9528f)
        curveTo(16.3771f, 22f, 16.2619f, 22f, 16.0316f, 22f)
        horizontalLineTo(7.96837f)
        curveTo(7.73805f, 22f, 7.6229f, 22f, 7.52211f, 21.9528f)
        curveTo(7.42132f, 21.9056f, 7.3476f, 21.8171f, 7.20015f, 21.6402f)
        lineTo(5.92711f, 20.1125f)
        curveTo(5.46831f, 19.562f, 5.23891f, 19.2867f, 5.11946f, 18.9568f)
        curveTo(5f, 18.6268f, 5f, 18.2685f, 5f, 17.5518f)
        verticalLineTo(6.4482f)
        curveTo(5f, 5.73153f, 5f, 5.3732f, 5.11946f, 5.04325f)
        curveTo(5.23891f, 4.7133f, 5.46831f, 4.43802f, 5.92711f, 3.88746f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5f)
        lineTo(19f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 19f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 2f)
        horizontalLineTo(18f)
        }
        }.build()

        return _sodaCan!!
    }

private var _sodaCan: ImageVector? = null
