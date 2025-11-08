package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = ImageVector.Builder(
            name = "Ambulance",
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
        moveTo(11f, 18f)
        horizontalLineTo(15f)
        moveTo(13.5f, 8f)
        horizontalLineTo(14.4429f)
        curveTo(15.7533f, 8f, 16.4086f, 8f, 16.9641f, 8.31452f)
        curveTo(17.5196f, 8.62904f, 17.89f, 9.20972f, 18.6308f, 10.3711f)
        curveTo(19.1502f, 11.1854f, 19.6955f, 11.7765f, 20.4622f, 12.3024f)
        curveTo(21.2341f, 12.8318f, 21.6012f, 13.0906f, 21.8049f, 13.506f)
        curveTo(22f, 13.9038f, 22f, 14.375f, 22f, 15.3173f)
        curveTo(22f, 16.5596f, 22f, 17.1808f, 21.651f, 17.5755f)
        curveTo(21.636f, 17.5925f, 21.6207f, 17.609f, 21.6049f, 17.625f)
        curveTo(21.2375f, 18f, 20.6594f, 18f, 19.503f, 18f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        curveTo(3.58579f, 18f, 2.87868f, 18f, 2.43934f, 17.5607f)
        curveTo(2f, 17.1213f, 2f, 16.4142f, 2f, 15f)
        verticalLineTo(8f)
        curveTo(2f, 6.58579f, 2f, 5.87868f, 2.43934f, 5.43934f)
        curveTo(2.87868f, 5f, 3.58579f, 5f, 5f, 5f)
        horizontalLineTo(10.5f)
        curveTo(11.9142f, 5f, 12.6213f, 5f, 13.0607f, 5.43934f)
        curveTo(13.5f, 5.87868f, 13.5f, 6.58579f, 13.5f, 8f)
        verticalLineTo(18f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 15f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        verticalLineTo(13f)
        moveTo(10f, 11f)
        lineTo(6f, 11f)
        }
        }.build()

        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
