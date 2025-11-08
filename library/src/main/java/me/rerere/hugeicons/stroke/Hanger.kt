package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = ImageVector.Builder(
            name = "Hanger",
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
        moveTo(4.12572f, 15.3668f)
        lineTo(10.1284f, 11.9903f)
        curveTo(10.7234f, 11.6556f, 11.3252f, 11.5f, 12f, 11.5f)
        curveTo(12.6748f, 11.5f, 13.2766f, 11.6556f, 13.8716f, 11.9903f)
        lineTo(19.8743f, 15.3668f)
        curveTo(20.5697f, 15.7579f, 21f, 16.4937f, 21f, 17.2916f)
        curveTo(21f, 18.5113f, 20.0113f, 19.5f, 18.7916f, 19.5f)
        horizontalLineTo(5.20841f)
        curveTo(3.98874f, 19.5f, 3f, 18.5113f, 3f, 17.2916f)
        curveTo(3f, 16.4937f, 3.43034f, 15.7579f, 4.12572f, 15.3668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6.40476f)
        curveTo(10f, 5.35279f, 10.8954f, 4.5f, 12f, 4.5f)
        curveTo(13.1046f, 4.5f, 14f, 5.35279f, 14f, 6.40476f)
        curveTo(14f, 7.12453f, 13.5808f, 7.75106f, 12.9623f, 8.07498f)
        curveTo(12.473f, 8.33119f, 12f, 8.75724f, 12f, 9.30952f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _hanger!!
    }

private var _hanger: ImageVector? = null
