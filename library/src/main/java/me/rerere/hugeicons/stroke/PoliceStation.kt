package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoliceStation: ImageVector
    get() {
        if (_policeStation != null) {
            return _policeStation!!
        }
        _policeStation = ImageVector.Builder(
            name = "PoliceStation",
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
        moveTo(15.6181f, 6.99985f)
        curveTo(16.2653f, 7.12386f, 16.7429f, 7.34165f, 17.1213f, 7.72416f)
        curveTo(18f, 8.61245f, 18f, 10.0421f, 18f, 12.9015f)
        verticalLineTo(21.9998f)
        horizontalLineTo(6f)
        verticalLineTo(12.9015f)
        curveTo(6f, 10.0421f, 6f, 8.61245f, 6.87868f, 7.72416f)
        curveTo(7.25705f, 7.34165f, 7.73473f, 7.12386f, 8.38188f, 6.99985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21.9998f)
        horizontalLineTo(21f)
        curveTo(21.4714f, 21.9998f, 21.7071f, 21.9998f, 21.8536f, 21.8534f)
        curveTo(22f, 21.707f, 22f, 21.4713f, 22f, 20.9998f)
        verticalLineTo(15.9998f)
        curveTo(22f, 14.1142f, 22f, 13.1714f, 21.4142f, 12.5856f)
        curveTo(20.8284f, 11.9998f, 19.8856f, 11.9998f, 18f, 11.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21.9998f)
        horizontalLineTo(3f)
        curveTo(2.5286f, 21.9998f, 2.29289f, 21.9998f, 2.14645f, 21.8534f)
        curveTo(2f, 21.707f, 2f, 21.4713f, 2f, 20.9998f)
        verticalLineTo(15.9998f)
        curveTo(2f, 14.1142f, 2f, 13.1714f, 2.58579f, 12.5856f)
        curveTo(3.17157f, 11.9998f, 4.11438f, 11.9998f, 6f, 11.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        lineTo(12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15f)
        horizontalLineTo(10.2f)
        moveTo(15f, 15f)
        horizontalLineTo(13.8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.04217f, 4f)
        curveTo(10.9662f, 4f, 12.0004f, 2f, 12.0004f, 2f)
        curveTo(12.0004f, 2f, 13.0338f, 4f, 15.9578f, 4f)
        curveTo(16.1752f, 5.6875f, 15.6528f, 9.65f, 12.0004f, 11f)
        curveTo(8.34791f, 9.65f, 7.82476f, 5.6875f, 8.04217f, 4f)
        }
        }.build()

        return _policeStation!!
    }

private var _policeStation: ImageVector? = null
