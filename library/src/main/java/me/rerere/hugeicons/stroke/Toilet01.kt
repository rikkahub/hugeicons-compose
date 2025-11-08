package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Toilet01: ImageVector
    get() {
        if (_toilet01 != null) {
            return _toilet01!!
        }
        _toilet01 = ImageVector.Builder(
            name = "Toilet01",
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
        moveTo(8f, 11f)
        horizontalLineTo(17.1351f)
        curveTo(18.6001f, 11f, 19.3326f, 11f, 19.7749f, 11.7353f)
        curveTo(20.2172f, 12.4706f, 19.9567f, 12.9393f, 19.4357f, 13.8769f)
        curveTo(18.4017f, 15.738f, 16.3955f, 17f, 14.0901f, 17f)
        curveTo(12.5456f, 17f, 11.1353f, 16.4335f, 10.0618f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11f)
        verticalLineTo(4f)
        curveTo(8f, 3.05719f, 8f, 2.58579f, 7.70711f, 2.29289f)
        curveTo(7.41421f, 2f, 6.94281f, 2f, 6f, 2f)
        curveTo(5.05719f, 2f, 4.58579f, 2f, 4.29289f, 2.29289f)
        curveTo(4f, 2.58579f, 4f, 3.05719f, 4f, 4f)
        verticalLineTo(11f)
        curveTo(4f, 11.9428f, 4f, 12.4142f, 4.29289f, 12.7071f)
        curveTo(4.58579f, 13f, 5.05719f, 13f, 6f, 13f)
        curveTo(6.94281f, 13f, 7.41421f, 13f, 7.70711f, 12.7071f)
        curveTo(8f, 12.4142f, 8f, 11.9428f, 8f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        lineTo(10f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 17f)
        curveTo(15f, 18f, 16f, 21f, 17.9996f, 22f)
        horizontalLineTo(4f)
        curveTo(5f, 21f, 6.7f, 17.8f, 5.5f, 13f)
        }
        }.build()

        return _toilet01!!
    }

private var _toilet01: ImageVector? = null
