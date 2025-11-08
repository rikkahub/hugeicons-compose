package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PaintBrush04: ImageVector
    get() {
        if (_paintBrush04 != null) {
            return _paintBrush04!!
        }
        _paintBrush04 = ImageVector.Builder(
            name = "PaintBrush04",
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
        moveTo(10f, 4f)
        curveTo(10f, 2.89543f, 10.8954f, 2f, 12f, 2f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 2f, 15f, 2.89543f, 15f, 4f)
        verticalLineTo(6.55337f)
        curveTo(15f, 7.86603f, 15.8534f, 9.02626f, 17.1065f, 9.41722f)
        lineTo(17.8935f, 9.66278f)
        curveTo(19.1466f, 10.0537f, 20f, 11.214f, 20f, 12.5266f)
        verticalLineTo(14f)
        curveTo(20f, 14.5523f, 19.5523f, 15f, 19f, 15f)
        horizontalLineTo(6f)
        curveTo(5.44772f, 15f, 5f, 14.5523f, 5f, 14f)
        verticalLineTo(12.5266f)
        curveTo(5f, 11.214f, 5.85339f, 10.0537f, 7.10648f, 9.66278f)
        lineTo(7.89352f, 9.41722f)
        curveTo(9.14661f, 9.02626f, 10f, 7.86603f, 10f, 6.55337f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00217f, 15f)
        curveTo(6.15797f, 16.3082f, 5.4957f, 19.5132f, 4f, 21.8679f)
        curveTo(4f, 21.8679f, 14.2924f, 23.0594f, 15.6851f, 17.9434f)
        verticalLineTo(19.8712f)
        curveTo(15.6851f, 20.8125f, 15.6851f, 21.2831f, 15.9783f, 21.5755f)
        curveTo(16.5421f, 22.1377f, 19.1891f, 22.1531f, 19.7538f, 21.5521f)
        curveTo(20.0504f, 21.2363f, 20.0207f, 20.7819f, 19.9611f, 19.8731f)
        curveTo(19.8629f, 18.3746f, 19.5932f, 16.4558f, 18.8523f, 15f)
        }
        }.build()

        return _paintBrush04!!
    }

private var _paintBrush04: ImageVector? = null
