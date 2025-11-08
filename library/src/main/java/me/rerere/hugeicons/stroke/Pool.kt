package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pool: ImageVector
    get() {
        if (_pool != null) {
            return _pool!!
        }
        _pool = ImageVector.Builder(
            name = "Pool",
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
        moveTo(22f, 21f)
        horizontalLineTo(21f)
        curveTo(19.5486f, 21f, 18.278f, 20.1411f, 18f, 19f)
        curveTo(17.722f, 20.1411f, 16.4514f, 21f, 15f, 21f)
        curveTo(13.5486f, 21f, 12.278f, 20.1411f, 12f, 19f)
        curveTo(11.722f, 20.1411f, 10.4514f, 21f, 9f, 21f)
        curveTo(7.54863f, 21f, 6.27796f, 20.1411f, 6f, 19f)
        curveTo(5.72204f, 20.1411f, 4.45137f, 21f, 3f, 21f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 3f)
        lineTo(18.7351f, 3.0883f)
        curveTo(17.4151f, 3.52832f, 16.755f, 3.74832f, 16.3775f, 4.2721f)
        curveTo(16f, 4.79587f, 16f, 5.49159f, 16f, 6.88304f)
        lineTo(16f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 3f)
        lineTo(10.7351f, 3.0883f)
        curveTo(9.41505f, 3.52832f, 8.75503f, 3.74832f, 8.37752f, 4.2721f)
        curveTo(8f, 4.79587f, 8f, 5.49159f, 8f, 6.88304f)
        lineTo(8f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(16f)
        moveTo(8f, 11f)
        horizontalLineTo(16f)
        moveTo(8f, 15f)
        horizontalLineTo(16f)
        }
        }.build()

        return _pool!!
    }

private var _pool: ImageVector? = null
