package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FunctionOfX: ImageVector
    get() {
        if (_functionOfX != null) {
            return _functionOfX!!
        }
        _functionOfX = ImageVector.Builder(
            name = "FunctionOfX",
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
        moveTo(2f, 18.2222f)
        curveTo(2.18866f, 19.0724f, 2.56908f, 20f, 3.56235f, 20f)
        curveTo(5.28118f, 20f, 5.71088f, 18.2222f, 7f, 12f)
        curveTo(8.28912f, 5.77778f, 8.71882f, 4f, 10.4376f, 4f)
        curveTo(11.4309f, 4f, 11.8113f, 4.92763f, 12f, 5.77778f)
        moveTo(4.91667f, 9.77778f)
        horizontalLineTo(10.4376f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        curveTo(22.3804f, 15.253f, 22.2854f, 16.9808f, 21f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(10.6196f, 15.253f, 10.7146f, 16.9808f, 12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.2891f, 13.9992f)
        curveTo(15.093f, 13.9692f, 15.5515f, 14.064f, 15.8227f, 14.5459f)
        curveTo(16.1515f, 15.216f, 16.9785f, 17.0679f, 17.1835f, 17.472f)
        curveTo(17.3073f, 17.6489f, 17.4715f, 17.904f, 17.9995f, 17.9875f)
        lineTo(18.7099f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.0025f, 14f)
        curveTo(17.8793f, 14f, 17.0873f, 15.288f, 16.5593f, 15.936f)
        curveTo(15.7913f, 16.944f, 14.927f, 18.05f, 13.9961f, 18f)
        }
        }.build()

        return _functionOfX!!
    }

private var _functionOfX: ImageVector? = null
