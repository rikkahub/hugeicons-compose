package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlowerPot: ImageVector
    get() {
        if (_flowerPot != null) {
            return _flowerPot!!
        }
        _flowerPot = ImageVector.Builder(
            name = "FlowerPot",
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
        moveTo(12f, 9f)
        curveTo(12f, 4.5f, 14f, 4f, 16f, 4f)
        curveTo(16f, 7f, 14.5f, 9f, 12f, 9f)
        moveTo(12f, 9f)
        curveTo(12f, 4.5f, 10f, 4f, 8f, 4f)
        curveTo(8f, 7f, 9.5f, 9f, 12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 4f)
        curveTo(10f, 4f, 10.5f, 2.5f, 12f, 2f)
        curveTo(13.5f, 2.5f, 14f, 4f, 14f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        curveTo(12.25f, 12.3333f, 13.2f, 11f, 15f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1509f, 15f)
        horizontalLineTo(10.8491f)
        curveTo(8.79675f, 15f, 7.77055f, 15f, 7.2641f, 15.5967f)
        curveTo(6.75765f, 16.1934f, 7.03957f, 17.0703f, 7.6034f, 18.8242f)
        lineTo(7.69704f, 19.1154f)
        curveTo(8.14071f, 20.4955f, 8.36255f, 21.1855f, 8.95349f, 21.5878f)
        lineTo(8.97997f, 21.6055f)
        curveTo(9.57752f, 22f, 10.385f, 22f, 12f, 22f)
        curveTo(13.615f, 22f, 14.4225f, 22f, 15.02f, 21.6055f)
        lineTo(15.0465f, 21.5878f)
        curveTo(15.6375f, 21.1855f, 15.8593f, 20.4955f, 16.303f, 19.1154f)
        lineTo(16.3966f, 18.8242f)
        curveTo(16.9604f, 17.0703f, 17.2423f, 16.1934f, 16.7359f, 15.5967f)
        curveTo(16.2294f, 15f, 15.2033f, 15f, 13.1509f, 15f)
        }
        }.build()

        return _flowerPot!!
    }

private var _flowerPot: ImageVector? = null
