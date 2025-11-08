package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Digestion: ImageVector
    get() {
        if (_digestion != null) {
            return _digestion!!
        }
        _digestion = ImageVector.Builder(
            name = "Digestion",
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
        moveTo(9.48457f, 2f)
        curveTo(9.72845f, 3.49019f, 10.4411f, 4.57432f, 12.475f, 3.87202f)
        curveTo(16.6773f, 2.42099f, 19.9986f, 6.8491f, 19.9986f, 10.8f)
        curveTo(19.9986f, 14.7765f, 17.353f, 18f, 14.0895f, 18f)
        horizontalLineTo(13.0247f)
        curveTo(10.492f, 18f, 8.27593f, 19.6321f, 7.45312f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.0058f, 2f)
        verticalLineTo(2.77557f)
        curveTo(6.0058f, 6.57844f, 11.4279f, 9.38737f, 9.63736f, 13.1999f)
        curveTo(8.92581f, 14.715f, 4.89483f, 17.2931f, 4f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        curveTo(14.9576f, 7.29708f, 15.711f, 8.04937f, 16f, 9f)
        }
        }.build()

        return _digestion!!
    }

private var _digestion: ImageVector? = null
