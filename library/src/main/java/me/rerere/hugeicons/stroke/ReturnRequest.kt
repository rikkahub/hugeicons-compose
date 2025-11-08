package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ReturnRequest: ImageVector
    get() {
        if (_returnRequest != null) {
            return _returnRequest!!
        }
        _returnRequest = ImageVector.Builder(
            name = "ReturnRequest",
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
        moveTo(3f, 13f)
        verticalLineTo(8f)
        horizontalLineTo(21f)
        verticalLineTo(13f)
        curveTo(21f, 16.7712f, 21f, 18.6569f, 19.8284f, 19.8284f)
        curveTo(18.6569f, 21f, 16.7712f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
        curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        lineTo(3.86538f, 6.07692f)
        curveTo(4.53654f, 4.58547f, 4.87211f, 3.83975f, 5.55231f, 3.41987f)
        curveTo(6.23251f, 3f, 7.105f, 3f, 8.85f, 3f)
        horizontalLineTo(15.15f)
        curveTo(16.895f, 3f, 17.7675f, 3f, 18.4477f, 3.41987f)
        curveTo(19.1279f, 3.83975f, 19.4635f, 4.58547f, 20.1346f, 6.07692f)
        lineTo(21f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 13.5f)
        horizontalLineTo(14f)
        curveTo(15.1046f, 13.5f, 16f, 14.3954f, 16f, 15.5f)
        curveTo(16f, 16.6046f, 15.1046f, 17.5f, 14f, 17.5f)
        horizontalLineTo(13f)
        moveTo(10f, 11.5f)
        lineTo(8f, 13.5f)
        lineTo(10f, 15.5f)
        }
        }.build()

        return _returnRequest!!
    }

private var _returnRequest: ImageVector? = null
