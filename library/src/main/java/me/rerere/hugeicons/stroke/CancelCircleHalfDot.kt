package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CancelCircleHalfDot: ImageVector
    get() {
        if (_cancelCircleHalfDot != null) {
            return _cancelCircleHalfDot!!
        }
        _cancelCircleHalfDot = ImageVector.Builder(
            name = "CancelCircleHalfDot",
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
        moveTo(12f, 2.00012f)
        curveTo(17.5228f, 2.00012f, 22f, 6.47727f, 22f, 12.0001f)
        curveTo(22f, 17.523f, 17.5228f, 22.0001f, 12f, 22.0001f)
        curveTo(6.47715f, 22.0001f, 2f, 17.523f, 2f, 12.0001f)
        moveTo(8.909f, 2.48699f)
        curveTo(7.9f, 2.8146f, 6.96135f, 3.29828f, 6.12153f, 3.90953f)
        moveTo(3.90943f, 6.12162f)
        curveTo(3.29806f, 6.9616f, 2.81432f, 7.90044f, 2.4867f, 8.90964f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9994f, 15.0001f)
        lineTo(9f, 9.00012f)
        moveTo(9.00064f, 15.0001f)
        lineTo(15f, 9.00012f)
        }
        }.build()

        return _cancelCircleHalfDot!!
    }

private var _cancelCircleHalfDot: ImageVector? = null
