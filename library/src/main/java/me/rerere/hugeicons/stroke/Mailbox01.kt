package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mailbox01: ImageVector
    get() {
        if (_mailbox01 != null) {
            return _mailbox01!!
        }
        _mailbox01 = ImageVector.Builder(
            name = "Mailbox01",
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
        moveTo(6.5f, 9f)
        horizontalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 8f)
        verticalLineTo(4f)
        curveTo(17.5f, 2.89543f, 18.3954f, 2f, 19.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 18f)
        lineTo(12.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 5.15889f)
        curveTo(16.5351f, 5f, 15.2591f, 5f, 13.375f, 5f)
        horizontalLineTo(10.625f)
        curveTo(7.70671f, 5f, 6.24757f, 5f, 5.14302f, 5.59039f)
        curveTo(4.27088f, 6.05656f, 3.55656f, 6.77088f, 3.09039f, 7.64302f)
        curveTo(2.5f, 8.74757f, 2.5f, 10.2067f, 2.5f, 13.125f)
        curveTo(2.5f, 14.876f, 2.5f, 15.7515f, 2.85424f, 16.4142f)
        curveTo(3.13394f, 16.9375f, 3.56253f, 17.3661f, 4.08581f, 17.6458f)
        curveTo(4.74854f, 18f, 5.62403f, 18f, 7.375f, 18f)
        horizontalLineTo(16.625f)
        curveTo(18.376f, 18f, 19.2515f, 18f, 19.9142f, 17.6458f)
        curveTo(20.4375f, 17.3661f, 20.8661f, 16.9375f, 21.1458f, 16.4142f)
        curveTo(21.5f, 15.7515f, 21.5f, 14.876f, 21.5f, 13.125f)
        curveTo(21.5f, 10.2067f, 21.5f, 8.74757f, 20.9096f, 7.64302f)
        curveTo(20.7356f, 7.31755f, 20.5271f, 7.01406f, 20.2887f, 6.73725f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5006f, 18f)
        verticalLineTo(11f)
        curveTo(12.5006f, 10.071f, 12.5006f, 9.60649f, 12.439f, 9.21782f)
        curveTo(12.1002f, 7.07836f, 10.4222f, 5.40041f, 8.28276f, 5.06155f)
        curveTo(8.2009f, 5.04859f, 8.11566f, 5.03835f, 8.02344f, 5.03027f)
        }
        }.build()

        return _mailbox01!!
    }

private var _mailbox01: ImageVector? = null
