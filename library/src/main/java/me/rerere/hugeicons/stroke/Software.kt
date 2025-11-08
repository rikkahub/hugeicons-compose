package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Software: ImageVector
    get() {
        if (_software != null) {
            return _software!!
        }
        _software = ImageVector.Builder(
            name = "Software",
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
        moveTo(10f, 10f)
        curveTo(10f, 11.1046f, 10.8954f, 12f, 12f, 12f)
        curveTo(13.1046f, 12f, 14f, 11.1046f, 14f, 10f)
        curveTo(14f, 8.89543f, 13.1046f, 8f, 12f, 8f)
        curveTo(10.8954f, 8f, 10f, 8.89543f, 10f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.2454f, 15f)
        curveTo(19.3433f, 13.6304f, 20f, 11.8919f, 20f, 10f)
        curveTo(20f, 5.58172f, 16.4183f, 2f, 12f, 2f)
        curveTo(7.58172f, 2f, 4f, 5.58172f, 4f, 10f)
        curveTo(4f, 11.8919f, 4.65672f, 13.6304f, 5.75463f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 18.5f)
        curveTo(3f, 17.0955f, 3f, 16.3933f, 3.30335f, 15.8889f)
        curveTo(3.43468f, 15.6705f, 3.60343f, 15.483f, 3.79997f, 15.3371f)
        curveTo(4.25398f, 15f, 4.88598f, 15f, 6.15f, 15f)
        horizontalLineTo(17.85f)
        curveTo(19.114f, 15f, 19.746f, 15f, 20.2f, 15.3371f)
        curveTo(20.3966f, 15.483f, 20.5653f, 15.6705f, 20.6966f, 15.8889f)
        curveTo(21f, 16.3933f, 21f, 17.0955f, 21f, 18.5f)
        curveTo(21f, 19.9045f, 21f, 20.6067f, 20.6966f, 21.1111f)
        curveTo(20.5653f, 21.3295f, 20.3966f, 21.517f, 20.2f, 21.6629f)
        curveTo(19.746f, 22f, 19.114f, 22f, 17.85f, 22f)
        horizontalLineTo(6.15f)
        curveTo(4.88598f, 22f, 4.25398f, 22f, 3.79997f, 21.6629f)
        curveTo(3.60343f, 21.517f, 3.43468f, 21.3295f, 3.30335f, 21.1111f)
        curveTo(3f, 20.6067f, 3f, 19.9045f, 3f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8904f, 6.61055f)
        lineTo(17.9018f, 4.59912f)
        }
        }.build()

        return _software!!
    }

private var _software: ImageVector? = null
