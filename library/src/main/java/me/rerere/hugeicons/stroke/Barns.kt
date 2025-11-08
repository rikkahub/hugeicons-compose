package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Barns: ImageVector
    get() {
        if (_barns != null) {
            return _barns!!
        }
        _barns = ImageVector.Builder(
            name = "Barns",
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
        moveTo(4.36271f, 6.29582f)
        lineTo(3.34475f, 8.60655f)
        curveTo(3.17301f, 8.9964f, 3.08714f, 9.19133f, 3.04357f, 9.39845f)
        curveTo(3f, 9.60558f, 3f, 9.81889f, 3f, 10.2455f)
        verticalLineTo(19.9823f)
        curveTo(3f, 20.9335f, 3f, 21.4091f, 3.29289f, 21.7046f)
        curveTo(3.58579f, 22.0001f, 4.05719f, 22.0001f, 5f, 22.0001f)
        horizontalLineTo(19f)
        curveTo(19.9428f, 22.0001f, 20.4142f, 22.0001f, 20.7071f, 21.7046f)
        curveTo(21f, 21.4091f, 21f, 20.9335f, 21f, 19.9823f)
        verticalLineTo(9.83734f)
        curveTo(21f, 9.36317f, 21f, 9.12608f, 20.9465f, 8.89743f)
        curveTo(20.893f, 8.66878f, 20.7879f, 8.45672f, 20.5777f, 8.03261f)
        lineTo(19.6553f, 6.17136f)
        curveTo(19.3311f, 5.51721f, 19.169f, 5.19013f, 18.9108f, 4.94458f)
        curveTo(18.6527f, 4.69903f, 18.3196f, 4.55498f, 17.6532f, 4.26688f)
        lineTo(13.5757f, 2.50385f)
        curveTo(12.7989f, 2.16799f, 12.4105f, 2.00006f, 12f, 2.00006f)
        curveTo(11.5895f, 2.00006f, 11.2011f, 2.16799f, 10.4243f, 2.50385f)
        lineTo(6.44228f, 4.22558f)
        curveTo(5.72974f, 4.53367f, 5.37347f, 4.68771f, 5.10422f, 4.95575f)
        curveTo(4.83498f, 5.22378f, 4.67755f, 5.58113f, 4.36271f, 6.29582f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        verticalLineTo(13f)
        moveTo(17f, 13f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13f)
        lineTo(17f, 22f)
        moveTo(7f, 22f)
        lineTo(17f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 13f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        curveTo(13.1046f, 10f, 14f, 9.10457f, 14f, 8f)
        curveTo(14f, 6.89543f, 13.1046f, 6f, 12f, 6f)
        curveTo(10.8954f, 6f, 10f, 6.89543f, 10f, 8f)
        curveTo(10f, 9.10457f, 10.8954f, 10f, 12f, 10f)
        }
        }.build()

        return _barns!!
    }

private var _barns: ImageVector? = null
