package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StudyDesk: ImageVector
    get() {
        if (_studyDesk != null) {
            return _studyDesk!!
        }
        _studyDesk = ImageVector.Builder(
            name = "StudyDesk",
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
        moveTo(22f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 17f)
        horizontalLineTo(16f)
        curveTo(14.1144f, 17f, 13.1716f, 17f, 12.5858f, 16.4142f)
        curveTo(12f, 15.8284f, 12f, 14.8856f, 12f, 13f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        verticalLineTo(22f)
        moveTo(20f, 12f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0401f, 2.59903f)
        curveTo(14.3088f, 1.90313f, 13.1232f, 1.90313f, 12.3919f, 2.59903f)
        curveTo(11.9784f, 2.99247f, 11.8198f, 3.4444f, 12.2767f, 3.87914f)
        lineTo(13.6927f, 5.22669f)
        curveTo(14.149f, 5.66087f, 14.6219f, 5.51714f, 15.0401f, 5.11912f)
        curveTo(15.7714f, 4.42322f, 15.7714f, 3.29494f, 15.0401f, 2.59903f)
        moveTo(15.0401f, 2.59903f)
        curveTo(15.5358f, 2.27324f, 16.0932f, 1.81764f, 16.7123f, 2.0763f)
        curveTo(17.0028f, 2.19766f, 17.2022f, 2.49474f, 17.6008f, 3.08889f)
        lineTo(19.0993f, 5.3223f)
        curveTo(19.6639f, 6.16376f, 19.9462f, 6.5845f, 19.9931f, 7.06138f)
        curveTo(20.0401f, 7.53825f, 19.8448f, 8.00129f, 19.4542f, 8.92735f)
        lineTo(18.1584f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        verticalLineTo(7.5f)
        curveTo(4f, 6.37313f, 4.4506f, 6f, 5.5f, 6f)
        curveTo(6.5494f, 6f, 7f, 6.37313f, 7f, 7.5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        verticalLineTo(7.5f)
        curveTo(7f, 6.37313f, 7.4506f, 6f, 8.5f, 6f)
        curveTo(9.5494f, 6f, 10f, 6.37313f, 10f, 7.5f)
        verticalLineTo(12f)
        }
        }.build()

        return _studyDesk!!
    }

private var _studyDesk: ImageVector? = null
