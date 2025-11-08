package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = ImageVector.Builder(
            name = "Cheese",
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
        moveTo(22f, 10f)
        verticalLineTo(13.7113f)
        curveTo(22f, 16.3939f, 22f, 17.7352f, 21.2244f, 18.6262f)
        curveTo(20.5311f, 19.4225f, 19.4318f, 19.6137f, 17.3727f, 19.836f)
        curveTo(17.1241f, 19.8628f, 16.9f, 19.6972f, 16.7922f, 19.4716f)
        curveTo(16.4649f, 18.7869f, 15.7853f, 18.3164f, 15f, 18.3164f)
        curveTo(14.0712f, 18.3164f, 13.2902f, 18.9746f, 13.0652f, 19.8668f)
        curveTo(13.0048f, 20.1064f, 12.8209f, 20.3101f, 12.5751f, 20.3357f)
        lineTo(8.59703f, 20.7492f)
        curveTo(5.515f, 21.0696f, 3.97397f, 21.2298f, 2.98698f, 20.3013f)
        curveTo(2f, 19.3727f, 2f, 17.7628f, 2f, 14.5429f)
        verticalLineTo(11.0395f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.92976f, 11.9175f)
        lineTo(18.469f, 11.4342f)
        curveTo(21.2105f, 11.3194f, 22.8695f, 10.5154f, 21.5235f, 7.65944f)
        curveTo(20.5882f, 5.67494f, 18.9063f, 4.08622f, 16.823f, 3.22601f)
        curveTo(15.4742f, 2.66906f, 14.4121f, 3.23705f, 13.2962f, 3.89603f)
        curveTo(12.9147f, 4.12127f, 13.0788f, 4.55791f, 13.0788f, 4.91045f)
        curveTo(13.0788f, 6.02915f, 12.1759f, 6.93603f, 11.0621f, 6.93603f)
        curveTo(10.5717f, 6.93603f, 10.1223f, 6.76028f, 9.7727f, 6.46807f)
        curveTo(8.82025f, 5.67186f, 1.67251f, 10.3221f, 2.01169f, 11.3933f)
        curveTo(2.23981f, 12.1138f, 3.80313f, 12.0484f, 6.92976f, 11.9175f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0078f, 8.20947f)
        lineTo(15.9988f, 8.20947f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0078f, 15.2095f)
        lineTo(16.9988f, 15.2095f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 16.2095f)
        curveTo(7f, 17.0379f, 7.67157f, 17.7095f, 8.5f, 17.7095f)
        curveTo(9.32843f, 17.7095f, 10f, 17.0379f, 10f, 16.2095f)
        curveTo(10f, 15.381f, 9.32843f, 14.7095f, 8.5f, 14.7095f)
        curveTo(7.67157f, 14.7095f, 7f, 15.381f, 7f, 16.2095f)
        }
        }.build()

        return _cheese!!
    }

private var _cheese: ImageVector? = null
