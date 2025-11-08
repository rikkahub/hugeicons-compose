package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pokemon: ImageVector
    get() {
        if (_pokemon != null) {
            return _pokemon!!
        }
        _pokemon = ImageVector.Builder(
            name = "Pokemon",
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
        moveTo(12f, 21f)
        curveTo(16.4183f, 21f, 20f, 19.2091f, 20f, 17f)
        curveTo(20f, 16.0234f, 19.1597f, 15.468f, 18.9475f, 14.5886f)
        curveTo(18.8278f, 14.0928f, 19f, 13.5112f, 19f, 13f)
        curveTo(19f, 11.8639f, 18.7293f, 10.7909f, 18.2489f, 9.84218f)
        curveTo(20.1255f, 8.21287f, 22f, 5.60644f, 22f, 3f)
        curveTo(17.8474f, 3f, 15.7434f, 5.3492f, 15.0997f, 6.72194f)
        curveTo(13.1658f, 5.76534f, 10.8342f, 5.76534f, 8.90035f, 6.72194f)
        curveTo(8.25655f, 5.3492f, 6.15258f, 3f, 2f, 3f)
        curveTo(2f, 5.60644f, 3.87445f, 8.21287f, 5.75106f, 9.84218f)
        curveTo(5.27067f, 10.7909f, 5f, 11.8639f, 5f, 13f)
        curveTo(5f, 13.5112f, 5.17216f, 14.0928f, 5.05251f, 14.5886f)
        curveTo(4.8403f, 15.468f, 4f, 16.0234f, 4f, 17f)
        curveTo(4f, 19.2091f, 7.58172f, 21f, 12f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16f)
        curveTo(11.7925f, 16.6596f, 12.206f, 16.6737f, 13f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00019f, 12.5f)
        horizontalLineTo(8.99121f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.008f, 12.5f)
        horizontalLineTo(14.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.1084f, 14.0233f)
        curveTo(6.36213f, 14.4245f, 8.19257f, 16.7314f, 5.78541f, 18.9379f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8926f, 14.043f)
        curveTo(17.6388f, 14.4442f, 15.8084f, 16.751f, 18.2156f, 18.9576f)
        }
        }.build()

        return _pokemon!!
    }

private var _pokemon: ImageVector? = null
