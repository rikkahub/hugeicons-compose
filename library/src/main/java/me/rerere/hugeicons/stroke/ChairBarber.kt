package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChairBarber: ImageVector
    get() {
        if (_chairBarber != null) {
            return _chairBarber!!
        }
        _chairBarber = ImageVector.Builder(
            name = "ChairBarber",
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
        moveTo(15.6972f, 15f)
        horizontalLineTo(8f)
        curveTo(6.89543f, 15f, 6f, 14.0951f, 6f, 12.9788f)
        curveTo(6f, 11.8625f, 6.89796f, 10.9517f, 8.00141f, 11.002f)
        curveTo(12.6902f, 11.2157f, 15.2951f, 12.1485f, 16.384f, 12.6526f)
        curveTo(16.78f, 12.836f, 17f, 13.2432f, 17f, 13.6834f)
        curveTo(17f, 14.4105f, 16.4167f, 15f, 15.6972f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        lineTo(20.9401f, 3.48443f)
        curveTo(21.1497f, 2.90943f, 20.7906f, 2.29091f, 20.1533f, 2.12892f)
        curveTo(18.5192f, 1.71359f, 16.8081f, 2.31124f, 16.2695f, 3.78511f)
        curveTo(15.6441f, 5.49648f, 15f, 8.13095f, 15f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7.96065f)
        curveTo(15f, 7.96065f, 11.6187f, 6.56598f, 10.3204f, 7.13972f)
        curveTo(9.93065f, 7.31195f, 9.59819f, 7.59728f, 9.36369f, 7.96079f)
        curveTo(9f, 8.52455f, 9f, 9.3497f, 9f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 13f)
        verticalLineTo(16f)
        curveTo(6f, 16.9319f, 6f, 17.3978f, 5.84776f, 17.7654f)
        curveTo(5.64477f, 18.2554f, 5.25542f, 18.6448f, 4.76537f, 18.8478f)
        curveTo(4.39782f, 19f, 3.93188f, 19f, 3f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21f)
        horizontalLineTo(14f)
        }
        }.build()

        return _chairBarber!!
    }

private var _chairBarber: ImageVector? = null
