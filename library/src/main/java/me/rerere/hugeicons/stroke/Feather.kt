package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = ImageVector.Builder(
            name = "Feather",
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
        moveTo(9.68645f, 17f)
        curveTo(11.3214f, 17f, 12.1388f, 17f, 12.8739f, 16.6955f)
        curveTo(13.609f, 16.3911f, 14.187f, 15.8131f, 15.3431f, 14.657f)
        lineTo(19.7578f, 10.2426f)
        curveTo(21.4147f, 8.58579f, 21.4147f, 5.8995f, 19.7578f, 4.24264f)
        curveTo(18.101f, 2.58579f, 15.4147f, 2.58578f, 13.7578f, 4.24264f)
        lineTo(9.34333f, 8.65682f)
        curveTo(8.18712f, 9.81296f, 7.60901f, 10.391f, 7.30451f, 11.1261f)
        curveTo(7f, 11.8612f, 7f, 12.6788f, 7f, 14.3139f)
        verticalLineTo(17f)
        horizontalLineTo(9.68645f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        lineTo(15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        horizontalLineTo(14.5f)
        }
        }.build()

        return _feather!!
    }

private var _feather: ImageVector? = null
