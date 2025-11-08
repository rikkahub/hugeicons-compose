package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Snow: ImageVector
    get() {
        if (_snow != null) {
            return _snow!!
        }
        _snow = ImageVector.Builder(
            name = "Snow",
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
        moveTo(21f, 14.25f)
        lineTo(20.1689f, 13.591f)
        curveTo(19.223f, 12.841f, 18.75f, 12.466f, 18.75f, 12f)
        curveTo(18.75f, 11.534f, 19.223f, 11.159f, 20.1689f, 10.409f)
        lineTo(21f, 9.75f)
        moveTo(3f, 9.75f)
        lineTo(3.83115f, 10.409f)
        curveTo(4.77705f, 11.159f, 5.25f, 11.534f, 5.25f, 12f)
        curveTo(5.25f, 12.466f, 4.77705f, 12.841f, 3.83115f, 13.591f)
        lineTo(3f, 14.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5718f, 21f)
        lineTo(14.7282f, 19.9412f)
        curveTo(14.9062f, 18.7362f, 14.9951f, 18.1337f, 15.4019f, 17.8986f)
        curveTo(15.8087f, 17.6635f, 16.3744f, 17.8876f, 17.5058f, 18.3358f)
        lineTo(18.5f, 18.7296f)
        moveTo(9.4282f, 3f)
        lineTo(9.27182f, 4.0588f)
        curveTo(9.09384f, 5.26379f, 9.00486f, 5.86629f, 8.59808f, 6.10139f)
        curveTo(8.1913f, 6.3365f, 7.62558f, 6.1124f, 6.49416f, 5.6642f)
        lineTo(5.5f, 5.27038f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18.7317f)
        lineTo(6.07032f, 18.3375f)
        curveTo(7.2884f, 17.8889f, 7.89747f, 17.6645f, 8.33521f, 17.8994f)
        curveTo(8.77295f, 18.1343f, 8.86844f, 18.7367f, 9.05941f, 19.9414f)
        lineTo(9.22722f, 21f)
        moveTo(19f, 5.26825f)
        lineTo(17.9297f, 5.66249f)
        curveTo(16.7116f, 6.11115f, 16.1025f, 6.33548f, 15.6648f, 6.1006f)
        curveTo(15.2271f, 5.86571f, 15.1316f, 5.26333f, 14.9406f, 4.05859f)
        lineTo(14.7728f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12.0003f)
        horizontalLineTo(5f)
        moveTo(15.5f, 17.9998f)
        lineTo(8.5f, 6f)
        moveTo(15.5f, 6.00025f)
        lineTo(8.5f, 18f)
        }
        }.build()

        return _snow!!
    }

private var _snow: ImageVector? = null
