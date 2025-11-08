package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextKerning: ImageVector
    get() {
        if (_textKerning != null) {
            return _textKerning!!
        }
        _textKerning = ImageVector.Builder(
            name = "TextKerning",
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
        moveTo(22f, 13.5f)
        lineTo(20.2857f, 9f)
        moveTo(20.2857f, 9f)
        lineTo(18.7816f, 5.0518f)
        curveTo(18.7399f, 4.9422f, 18.719f, 4.8874f, 18.6926f, 4.84085f)
        curveTo(18.5914f, 4.66247f, 18.4186f, 4.5405f, 18.2216f, 4.50838f)
        curveTo(18.1702f, 4.5f, 18.1135f, 4.5f, 18f, 4.5f)
        curveTo(17.8865f, 4.5f, 17.8298f, 4.5f, 17.7784f, 4.50838f)
        curveTo(17.5814f, 4.5405f, 17.4086f, 4.66247f, 17.3074f, 4.84085f)
        curveTo(17.281f, 4.8874f, 17.2601f, 4.9422f, 17.2184f, 5.0518f)
        lineTo(15.7143f, 9f)
        moveTo(20.2857f, 9f)
        lineTo(15.7143f, 9f)
        moveTo(15.7143f, 9f)
        lineTo(14f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 4.5f)
        lineTo(5.21836f, 12.9482f)
        curveTo(5.26012f, 13.0578f, 5.28099f, 13.1126f, 5.3074f, 13.1591f)
        curveTo(5.40861f, 13.3375f, 5.5814f, 13.4595f, 5.77836f, 13.4916f)
        curveTo(5.82975f, 13.5f, 5.8865f, 13.5f, 6f, 13.5f)
        curveTo(6.1135f, 13.5f, 6.17025f, 13.5f, 6.22164f, 13.4916f)
        curveTo(6.4186f, 13.4595f, 6.59138f, 13.3375f, 6.6926f, 13.1591f)
        curveTo(6.71901f, 13.1126f, 6.73988f, 13.0578f, 6.78164f, 12.9482f)
        lineTo(10f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19.5f)
        horizontalLineTo(22f)
        moveTo(22f, 19.5f)
        curveTo(22f, 19.8314f, 21.6667f, 20.098f, 21f, 20.6314f)
        lineTo(19.9142f, 21.5f)
        moveTo(22f, 19.5f)
        curveTo(22f, 19.1686f, 21.6667f, 18.902f, 21f, 18.3686f)
        lineTo(19.9142f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 2.5f)
        lineTo(9.5f, 15.5f)
        }
        }.build()

        return _textKerning!!
    }

private var _textKerning: ImageVector? = null
