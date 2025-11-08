package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GolfCart: ImageVector
    get() {
        if (_golfCart != null) {
            return _golfCart!!
        }
        _golfCart = ImageVector.Builder(
            name = "GolfCart",
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
        moveTo(3.99821f, 18.9818f)
        curveTo(3.07289f, 18.9818f, 2f, 19.2182f, 2f, 17.9874f)
        verticalLineTo(15.8389f)
        curveTo(2f, 14.1187f, 2f, 13.2587f, 2.49899f, 12.6951f)
        curveTo(3.27867f, 11.8144f, 4.78799f, 12.0211f, 5.8359f, 12.0211f)
        curveTo(6.64499f, 12.0211f, 7.64108f, 11.9089f, 8.32617f, 12.4323f)
        curveTo(8.77967f, 12.7788f, 8.99564f, 13.352f, 9.42757f, 14.4984f)
        curveTo(9.59263f, 14.9364f, 9.71105f, 15.5422f, 10.1161f, 15.8216f)
        curveTo(10.3729f, 15.9986f, 10.7078f, 15.9986f, 11.3776f, 15.9986f)
        horizontalLineTo(13.4897f)
        curveTo(14.8134f, 15.9986f, 15.2614f, 14.9734f, 15.9875f, 14.0099f)
        horizontalLineTo(17.5416f)
        curveTo(19.7316f, 14.0099f, 21.7599f, 15.286f, 21.9669f, 17.6407f)
        curveTo(22.0083f, 18.112f, 22.1219f, 18.9818f, 21.4271f, 18.9818f)
        horizontalLineTo(19.9839f)
        moveTo(15.9875f, 18.9818f)
        horizontalLineTo(8.49419f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        lineTo(16f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 14f)
        lineTo(14f, 11f)
        moveTo(13f, 12f)
        lineTo(15f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 12f)
        curveTo(6.5f, 9.97001f, 6.38046f, 8f, 4f, 8f)
        }
        }.build()

        return _golfCart!!
    }

private var _golfCart: ImageVector? = null
