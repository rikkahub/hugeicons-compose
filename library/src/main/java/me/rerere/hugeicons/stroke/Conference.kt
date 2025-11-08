package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Conference: ImageVector
    get() {
        if (_conference != null) {
            return _conference!!
        }
        _conference = ImageVector.Builder(
            name = "Conference",
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
        moveTo(19f, 15f)
        verticalLineTo(9f)
        curveTo(19f, 6.17157f, 19f, 4.75736f, 18.1213f, 3.87868f)
        curveTo(17.2426f, 3f, 15.8284f, 3f, 13f, 3f)
        horizontalLineTo(11f)
        curveTo(8.17157f, 3f, 6.75736f, 3f, 5.87868f, 3.87868f)
        curveTo(5f, 4.75736f, 5f, 6.17157f, 5f, 9f)
        verticalLineTo(15f)
        curveTo(5f, 17.8284f, 5f, 19.2426f, 5.87868f, 20.1213f)
        curveTo(6.75736f, 21f, 8.17157f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 21f, 17.2426f, 21f, 18.1213f, 20.1213f)
        curveTo(19f, 19.2426f, 19f, 17.8284f, 19f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9995f, 8.50873f)
        curveTo(13.9995f, 9.61326f, 13.1041f, 10.5087f, 11.9995f, 10.5087f)
        curveTo(10.895f, 10.5087f, 9.99958f, 9.61326f, 9.99958f, 8.50873f)
        curveTo(9.99958f, 7.40419f, 10.895f, 6.50879f, 11.9995f, 6.50879f)
        curveTo(13.1041f, 6.50879f, 13.9995f, 7.40419f, 13.9995f, 8.50873f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.04443f, 15.7322f)
        curveTo(9.10278f, 14.1029f, 10.7835f, 13.4923f, 11.9995f, 13.4935f)
        curveTo(13.2156f, 13.4948f, 14.847f, 14.1029f, 15.9054f, 15.7322f)
        curveTo(15.9738f, 15.8376f, 15.9926f, 15.9673f, 15.9309f, 16.0768f)
        curveTo(15.6834f, 16.5157f, 14.9149f, 17.3866f, 14.3598f, 17.4457f)
        curveTo(13.7221f, 17.5135f, 12.0537f, 17.523f, 12.0008f, 17.5233f)
        curveTo(11.9478f, 17.523f, 10.228f, 17.5135f, 9.58996f, 17.4457f)
        curveTo(9.0349f, 17.3866f, 8.26641f, 16.5157f, 8.0189f, 16.0768f)
        curveTo(7.95714f, 15.9673f, 7.976f, 15.8376f, 8.04443f, 15.7322f)
        }
        }.build()

        return _conference!!
    }

private var _conference: ImageVector? = null
