package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = ImageVector.Builder(
            name = "Bucket",
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
        moveTo(11f, 9f)
        curveTo(15.4183f, 9f, 19f, 7.65685f, 19f, 6f)
        curveTo(19f, 4.34315f, 15.4183f, 3f, 11f, 3f)
        curveTo(6.58172f, 3f, 3f, 4.34315f, 3f, 6f)
        curveTo(3f, 7.65685f, 6.58172f, 9f, 11f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 6f)
        lineTo(17.1498f, 18.9517f)
        curveTo(17.0561f, 19.6074f, 16.6462f, 20.1853f, 16.0121f, 20.377f)
        curveTo(14.7407f, 20.7614f, 12.9649f, 21f, 11f, 21f)
        curveTo(9.0351f, 21f, 7.25928f, 20.7614f, 5.98792f, 20.377f)
        curveTo(5.35384f, 20.1853f, 4.94392f, 19.6074f, 4.85024f, 18.9517f)
        lineTo(3f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14f)
        curveTo(11.5523f, 14f, 12f, 13.5523f, 12f, 13f)
        curveTo(12f, 12.4477f, 11.5523f, 12f, 11f, 12f)
        curveTo(10.4477f, 12f, 10f, 12.4477f, 10f, 13f)
        curveTo(10f, 13.5523f, 10.4477f, 14f, 11f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 13.172f)
        curveTo(11.295f, 13.3597f, 11.5997f, 13.5438f, 11.9133f, 13.7232f)
        curveTo(15.9608f, 16.0387f, 19.9523f, 16.6966f, 20.8286f, 15.1927f)
        curveTo(21.4199f, 14.1779f, 20.4419f, 12.4383f, 18.5f, 10.7027f)
        }
        }.build()

        return _bucket!!
    }

private var _bucket: ImageVector? = null
