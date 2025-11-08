package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = ImageVector.Builder(
            name = "Tags",
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
        moveTo(18.058f, 8.53645f)
        lineTo(17.058f, 7.92286f)
        curveTo(16.0553f, 7.30762f, 15.554f, 7f, 15f, 7f)
        curveTo(14.446f, 7f, 13.9447f, 7.30762f, 12.942f, 7.92286f)
        lineTo(11.942f, 8.53645f)
        curveTo(10.9935f, 9.11848f, 10.5192f, 9.40949f, 10.2596f, 9.87838f)
        curveTo(10f, 10.3473f, 10f, 10.9129f, 10f, 12.0442f)
        verticalLineTo(17.9094f)
        curveTo(10f, 19.8377f, 10f, 20.8019f, 10.5858f, 21.4009f)
        curveTo(11.1716f, 22f, 12.1144f, 22f, 14f, 22f)
        horizontalLineTo(16f)
        curveTo(17.8856f, 22f, 18.8284f, 22f, 19.4142f, 21.4009f)
        curveTo(20f, 20.8019f, 20f, 19.8377f, 20f, 17.9094f)
        verticalLineTo(12.0442f)
        curveTo(20f, 10.9129f, 20f, 10.3473f, 19.7404f, 9.87838f)
        curveTo(19.4808f, 9.40949f, 19.0065f, 9.11848f, 18.058f, 8.53645f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7.10809f)
        curveTo(13.3612f, 6.4951f, 12.9791f, 6.17285f, 12.4974f, 6.05178f)
        curveTo(11.9374f, 5.91102f, 11.3491f, 6.06888f, 10.1725f, 6.3846f)
        lineTo(8.99908f, 6.69947f)
        curveTo(7.88602f, 6.99814f, 7.32949f, 7.14748f, 6.94287f, 7.5163f)
        curveTo(6.55624f, 7.88513f, 6.40642f, 8.40961f, 6.10679f, 9.45857f)
        lineTo(4.55327f, 14.8971f)
        curveTo(4.0425f, 16.6852f, 3.78712f, 17.5792f, 4.22063f, 18.2836f)
        curveTo(4.59336f, 18.8892f, 6.0835f, 19.6339f, 7.5f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4947f, 10f)
        curveTo(15.336f, 9.44058f, 16.0828f, 8.54291f, 16.5468f, 7.42653f)
        curveTo(17.5048f, 5.12162f, 16.8944f, 2.75724f, 15.1836f, 2.14554f)
        curveTo(13.4727f, 1.53383f, 11.3091f, 2.90644f, 10.3512f, 5.21135f)
        curveTo(10.191f, 5.59667f, 10.0747f, 5.98366f, 10f, 6.36383f)
        }
        }.build()

        return _tags!!
    }

private var _tags: ImageVector? = null
