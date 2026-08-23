package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TvMinimalPlay: ImageVector
    get() {
        if (_tvMinimalPlay != null) {
            return _tvMinimalPlay!!
        }
        _tvMinimalPlay = ImageVector.Builder(
            name = "TvMinimalPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 14f)
            curveTo(2f, 10.2288f, 2f, 8.34315f, 3.17157f, 7.17157f)
            curveTo(4.34315f, 6f, 6.22876f, 6f, 10f, 6f)
            horizontalLineTo(14f)
            curveTo(17.7712f, 6f, 19.6569f, 6f, 20.8284f, 7.17157f)
            curveTo(22f, 8.34315f, 22f, 10.2288f, 22f, 14f)
            curveTo(22f, 17.7712f, 22f, 19.6569f, 20.8284f, 20.8284f)
            curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
            horizontalLineTo(10f)
            curveTo(6.22876f, 22f, 4.34315f, 22f, 3.17157f, 20.8284f)
            curveTo(2f, 19.6569f, 2f, 17.7712f, 2f, 14f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.957f, 14.3384f)
            curveTo(14.8182f, 14.8756f, 14.1619f, 15.2552f, 12.8494f, 16.0144f)
            curveTo(11.5806f, 16.7484f, 10.9462f, 17.1153f, 10.4349f, 16.9678f)
            curveTo(10.2236f, 16.9068f, 10.031f, 16.791f, 9.87567f, 16.6315f)
            curveTo(9.5f, 16.2456f, 9.5f, 15.497f, 9.5f, 14f)
            curveTo(9.5f, 12.503f, 9.5f, 11.7544f, 9.87567f, 11.3685f)
            curveTo(10.031f, 11.209f, 10.2236f, 11.0932f, 10.4349f, 11.0322f)
            curveTo(10.9462f, 10.8847f, 11.5806f, 11.2516f, 12.8494f, 11.9856f)
            curveTo(14.1619f, 12.7448f, 14.8182f, 13.1244f, 14.957f, 13.6616f)
            curveTo(15.0143f, 13.8834f, 15.0143f, 14.1166f, 14.957f, 14.3384f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9f, 3f)
            lineTo(12f, 6f)
            lineTo(16f, 2f)
        }
        }.build()

        return _tvMinimalPlay!!
    }

private var _tvMinimalPlay: ImageVector? = null
