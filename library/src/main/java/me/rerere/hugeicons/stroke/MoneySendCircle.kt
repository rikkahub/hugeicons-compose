package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneySendCircle: ImageVector
    get() {
        if (_moneySendCircle != null) {
            return _moneySendCircle!!
        }
        _moneySendCircle = ImageVector.Builder(
            name = "MoneySendCircle",
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
        moveTo(14f, 2.20004f)
        curveTo(13.3538f, 2.06886f, 12.6849f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.3151f, 21.9311f, 10.6462f, 21.8f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        curveTo(10.8954f, 9f, 10f, 9.67157f, 10f, 10.5f)
        curveTo(10f, 11.3284f, 10.8954f, 12f, 12f, 12f)
        curveTo(13.1046f, 12f, 14f, 12.6716f, 14f, 13.5f)
        curveTo(14f, 14.3284f, 13.1046f, 15f, 12f, 15f)
        moveTo(12f, 9f)
        curveTo(12.8708f, 9f, 13.6116f, 9.4174f, 13.8862f, 10f)
        moveTo(12f, 9f)
        verticalLineTo(8f)
        moveTo(12f, 15f)
        curveTo(11.1292f, 15f, 10.3884f, 14.5826f, 10.1138f, 14f)
        moveTo(12f, 15f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.998f, 7.00195f)
        lineTo(21.1739f, 2.82375f)
        moveTo(21.998f, 6.48019f)
        lineTo(21.8798f, 3.3887f)
        curveTo(21.8798f, 2.66006f, 21.4448f, 2.20607f, 20.6523f, 2.14881f)
        lineTo(17.5282f, 2.00195f)
        }
        }.build()

        return _moneySendCircle!!
    }

private var _moneySendCircle: ImageVector? = null
