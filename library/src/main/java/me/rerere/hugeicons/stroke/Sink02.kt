package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sink02: ImageVector
    get() {
        if (_sink02 != null) {
            return _sink02!!
        }
        _sink02 = ImageVector.Builder(
            name = "Sink02",
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
        moveTo(12f, 17f)
        curveTo(15.7593f, 17f, 18.9168f, 14.4405f, 19.8036f, 10.9798f)
        curveTo(20.0098f, 10.175f, 20.1129f, 9.77257f, 19.8107f, 9.38629f)
        curveTo(19.5085f, 9f, 19.0187f, 9f, 18.039f, 9f)
        horizontalLineTo(5.96096f)
        curveTo(4.98134f, 9f, 4.49153f, 9f, 4.18931f, 9.38629f)
        curveTo(3.88709f, 9.77257f, 3.99019f, 10.175f, 4.19641f, 10.9798f)
        curveTo(5.08317f, 14.4405f, 8.24074f, 17f, 12f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(3.5f)
        curveTo(12f, 2.67157f, 12.6716f, 2f, 13.5f, 2f)
        curveTo(14.3284f, 2f, 15f, 2.67157f, 15f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        verticalLineTo(8f)
        curveTo(9f, 7.05719f, 9f, 6.58579f, 8.70711f, 6.29289f)
        curveTo(8.41421f, 6f, 7.94281f, 6f, 7f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16.5f)
        lineTo(9.64223f, 20.0323f)
        curveTo(9.84941f, 21.1717f, 10.8418f, 22f, 12f, 22f)
        curveTo(13.1582f, 22f, 14.1506f, 21.1717f, 14.3578f, 20.0323f)
        lineTo(15f, 16.5f)
        }
        }.build()

        return _sink02!!
    }

private var _sink02: ImageVector? = null
