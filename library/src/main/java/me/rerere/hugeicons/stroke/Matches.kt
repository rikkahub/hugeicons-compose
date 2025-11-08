package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Matches: ImageVector
    get() {
        if (_matches != null) {
            return _matches!!
        }
        _matches = ImageVector.Builder(
            name = "Matches",
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
        moveTo(15f, 8f)
        horizontalLineTo(9f)
        curveTo(7.11438f, 8f, 6.17157f, 8f, 5.58579f, 8.58579f)
        curveTo(5f, 9.17157f, 5f, 10.1144f, 5f, 12f)
        verticalLineTo(18f)
        curveTo(5f, 19.8856f, 5f, 20.8284f, 5.58579f, 21.4142f)
        curveTo(6.17157f, 22f, 7.11438f, 22f, 9f, 22f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 22f, 17.8284f, 22f, 18.4142f, 21.4142f)
        curveTo(19f, 20.8284f, 19f, 19.8856f, 19f, 18f)
        verticalLineTo(12f)
        curveTo(19f, 10.1144f, 19f, 9.17157f, 18.4142f, 8.58579f)
        curveTo(17.8284f, 8f, 16.8856f, 8f, 15f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        verticalLineTo(6f)
        curveTo(18f, 4.11438f, 18f, 3.17157f, 17.4142f, 2.58579f)
        curveTo(16.8284f, 2f, 15.8856f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(8.11438f, 2f, 7.17157f, 2f, 6.58579f, 2.58579f)
        curveTo(6f, 3.17157f, 6f, 4.11438f, 6f, 6f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.1543f, 19f)
        curveTo(13.7259f, 19f, 15f, 17.7464f, 15f, 16.2f)
        curveTo(15f, 13.9048f, 12.5608f, 13.4f, 12.5608f, 11f)
        curveTo(10.7317f, 12f, 11f, 15f, 11f, 15f)
        curveTo(11f, 15f, 9.31084f, 15f, 9.31026f, 13.5f)
        curveTo(8.36162f, 16f, 9.66704f, 19f, 12.1543f, 19f)
        }
        }.build()

        return _matches!!
    }

private var _matches: ImageVector? = null
