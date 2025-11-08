package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cactus: ImageVector
    get() {
        if (_cactus != null) {
            return _cactus!!
        }
        _cactus = ImageVector.Builder(
            name = "Cactus",
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.90373f, 15f)
        lineTo(8.55745f, 7.93548f)
        curveTo(8.16693f, 5.8863f, 9.81696f, 4f, 12f, 4f)
        curveTo(14.183f, 4f, 15.8331f, 5.88629f, 15.4426f, 7.93548f)
        lineTo(14.0963f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        lineTo(12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 6f)
        lineTo(17f, 5f)
        moveTo(8.5f, 6f)
        lineTo(7f, 5f)
        moveTo(12f, 4f)
        verticalLineTo(2f)
        moveTo(15.5f, 10f)
        lineTo(17f, 11f)
        moveTo(8.5f, 10f)
        lineTo(7f, 11f)
        }
        }.build()

        return _cactus!!
    }

private var _cactus: ImageVector? = null
