package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CookBook: ImageVector
    get() {
        if (_cookBook != null) {
            return _cookBook!!
        }
        _cookBook = ImageVector.Builder(
            name = "CookBook",
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
        moveTo(21f, 16.9286f)
        verticalLineTo(10f)
        curveTo(21f, 6.22876f, 21f, 4.34315f, 19.8284f, 3.17157f)
        curveTo(18.6569f, 2f, 16.7712f, 2f, 13f, 2f)
        horizontalLineTo(12f)
        curveTo(8.22876f, 2f, 6.34315f, 2f, 5.17157f, 3.17157f)
        curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
        verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17f)
        horizontalLineTo(6.5f)
        curveTo(5.11929f, 17f, 4f, 18.1193f, 4f, 19.5f)
        curveTo(4f, 20.8807f, 5.11929f, 22f, 6.5f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        curveTo(19.6193f, 22f, 18.5f, 20.8807f, 18.5f, 19.5f)
        curveTo(18.5f, 18.1193f, 19.6193f, 17f, 21f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3877f, 6.84933f)
        curveTo(14.7057f, 6.63424f, 15.0883f, 6.50878f, 15.5f, 6.50878f)
        curveTo(16.6046f, 6.50878f, 17.5f, 7.41206f, 17.5f, 8.52633f)
        curveTo(17.5f, 9.62271f, 16.5957f, 10.54f, 15.5f, 10.54f)
        verticalLineTo(11.5f)
        curveTo(15.5f, 12.4428f, 15.5f, 12.9142f, 15.2071f, 13.2071f)
        curveTo(14.9142f, 13.5f, 14.4428f, 13.5f, 13.5f, 13.5f)
        horizontalLineTo(11.5f)
        curveTo(10.5572f, 13.5f, 10.0858f, 13.5f, 9.79289f, 13.2071f)
        curveTo(9.5f, 12.9142f, 9.5f, 12.4428f, 9.5f, 11.5f)
        verticalLineTo(10.665f)
        curveTo(8.33217f, 10.665f, 7.5f, 9.79515f, 7.5f, 8.52633f)
        curveTo(7.5f, 7.41206f, 8.39543f, 6.50878f, 9.5f, 6.50878f)
        curveTo(9.91166f, 6.50878f, 10.2943f, 6.63424f, 10.6123f, 6.84933f)
        curveTo(10.8857f, 6.06347f, 11.6276f, 5.5f, 12.5f, 5.5f)
        curveTo(13.3724f, 5.5f, 14.1143f, 6.06347f, 14.3877f, 6.84933f)
        moveTo(14.3877f, 6.84933f)
        curveTo(14.4604f, 7.05846f, 14.5f, 7.28335f, 14.5f, 7.51755f)
        }
        }.build()

        return _cookBook!!
    }

private var _cookBook: ImageVector? = null
