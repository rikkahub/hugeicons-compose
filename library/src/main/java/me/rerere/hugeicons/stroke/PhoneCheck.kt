package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PhoneCheck: ImageVector
    get() {
        if (_phoneCheck != null) {
            return _phoneCheck!!
        }
        _phoneCheck = ImageVector.Builder(
            name = "PhoneCheck",
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
        moveTo(17f, 7f)
        curveTo(17f, 4.64298f, 17f, 3.46447f, 16.2678f, 2.73223f)
        curveTo(15.5355f, 2f, 14.357f, 2f, 12f, 2f)
        horizontalLineTo(9f)
        curveTo(6.64298f, 2f, 5.46447f, 2f, 4.73223f, 2.73223f)
        curveTo(4f, 3.46447f, 4f, 4.64298f, 4f, 7f)
        verticalLineTo(17f)
        curveTo(4f, 19.357f, 4f, 20.5355f, 4.73223f, 21.2678f)
        curveTo(5.46447f, 22f, 6.64298f, 22f, 9f, 22f)
        horizontalLineTo(12f)
        curveTo(14.357f, 22f, 15.5355f, 22f, 16.2678f, 21.2678f)
        curveTo(17f, 20.5355f, 17f, 19.357f, 17f, 17f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 2f)
        horizontalLineTo(8.5f)
        lineTo(9f, 3f)
        horizontalLineTo(12f)
        lineTo(12.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12.5f)
        curveTo(12f, 12.5f, 13.3485f, 13.0067f, 14f, 15f)
        curveTo(14f, 15f, 17.1765f, 10f, 20f, 9f)
        }
        }.build()

        return _phoneCheck!!
    }

private var _phoneCheck: ImageVector? = null
