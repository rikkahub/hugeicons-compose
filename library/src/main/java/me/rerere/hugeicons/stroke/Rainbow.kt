package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = ImageVector.Builder(
            name = "Rainbow",
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
        moveTo(2f, 15f)
        verticalLineTo(12f)
        curveTo(2f, 7.58172f, 5.58172f, 4f, 10f, 4f)
        curveTo(13.3574f, 4f, 16.3229f, 6.06817f, 17.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        verticalLineTo(12f)
        curveTo(5f, 9.23858f, 7.23858f, 7f, 10f, 7f)
        curveTo(11.8507f, 7f, 13.6488f, 8.0055f, 14.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        verticalLineTo(12f)
        curveTo(8f, 10.8954f, 8.89543f, 10f, 10f, 10f)
        curveTo(10.9319f, 10f, 11.778f, 10.6374f, 12f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5127f, 15.2f)
        curveTo(19.5168f, 15.2f, 19.5209f, 15.2f, 19.525f, 15.2f)
        curveTo(20.8919f, 15.2f, 22f, 16.2745f, 22f, 17.6f)
        curveTo(22f, 18.9255f, 20.8919f, 20f, 19.525f, 20f)
        horizontalLineTo(13.75f)
        curveTo(12.2312f, 20f, 11f, 18.8061f, 11f, 17.3333f)
        curveTo(11f, 15.9469f, 12.0912f, 14.8075f, 13.4862f, 14.6788f)
        moveTo(19.5127f, 15.2f)
        curveTo(19.5208f, 15.1122f, 19.525f, 15.0232f, 19.525f, 14.9333f)
        curveTo(19.525f, 13.3133f, 18.1707f, 12f, 16.5f, 12f)
        curveTo(14.9178f, 12f, 13.6193f, 13.1779f, 13.4862f, 14.6788f)
        moveTo(19.5127f, 15.2f)
        curveTo(19.4564f, 15.8051f, 19.2107f, 16.3571f, 18.8336f, 16.8f)
        moveTo(13.4862f, 14.6788f)
        curveTo(13.573f, 14.6708f, 13.661f, 14.6667f, 13.75f, 14.6667f)
        curveTo(14.3692f, 14.6667f, 14.9406f, 14.8651f, 15.4003f, 15.2f)
        }
        }.build()

        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
