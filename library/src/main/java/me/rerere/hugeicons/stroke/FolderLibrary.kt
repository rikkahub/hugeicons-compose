package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderLibrary: ImageVector
    get() {
        if (_folderLibrary != null) {
            return _folderLibrary!!
        }
        _folderLibrary = ImageVector.Builder(
            name = "FolderLibrary",
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
        moveTo(16.2627f, 10.5f)
        horizontalLineTo(7.73725f)
        curveTo(5.15571f, 10.5f, 3.86494f, 10.5f, 3.27143f, 11.3526f)
        curveTo(2.67793f, 12.2052f, 3.11904f, 13.4258f, 4.00126f, 15.867f)
        lineTo(5.08545f, 18.867f)
        curveTo(5.54545f, 20.1398f, 5.77545f, 20.7763f, 6.2889f, 21.1381f)
        curveTo(6.80235f, 21.5f, 7.47538f, 21.5f, 8.82143f, 21.5f)
        horizontalLineTo(15.1786f)
        curveTo(16.5246f, 21.5f, 17.1976f, 21.5f, 17.7111f, 21.1381f)
        curveTo(18.2245f, 20.7763f, 18.4545f, 20.1398f, 18.9146f, 18.867f)
        lineTo(19.9987f, 15.867f)
        curveTo(20.881f, 13.4258f, 21.3221f, 12.2052f, 20.7286f, 11.3526f)
        curveTo(20.1351f, 10.5f, 18.8443f, 10.5f, 16.2627f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 8f)
        curveTo(19f, 7.53406f, 19f, 7.30109f, 18.9239f, 7.11732f)
        curveTo(18.8224f, 6.87229f, 18.6277f, 6.67761f, 18.3827f, 6.57612f)
        curveTo(18.1989f, 6.5f, 17.9659f, 6.5f, 17.5f, 6.5f)
        horizontalLineTo(6.5f)
        curveTo(6.03406f, 6.5f, 5.80109f, 6.5f, 5.61732f, 6.57612f)
        curveTo(5.37229f, 6.67761f, 5.17761f, 6.87229f, 5.07612f, 7.11732f)
        curveTo(5f, 7.30109f, 5f, 7.53406f, 5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 4f)
        curveTo(16.5f, 3.53406f, 16.5f, 3.30109f, 16.4239f, 3.11732f)
        curveTo(16.3224f, 2.87229f, 16.1277f, 2.67761f, 15.8827f, 2.57612f)
        curveTo(15.6989f, 2.5f, 15.4659f, 2.5f, 15f, 2.5f)
        horizontalLineTo(9f)
        curveTo(8.53406f, 2.5f, 8.30109f, 2.5f, 8.11732f, 2.57612f)
        curveTo(7.87229f, 2.67761f, 7.67761f, 2.87229f, 7.57612f, 3.11732f)
        curveTo(7.5f, 3.30109f, 7.5f, 3.53406f, 7.5f, 4f)
        }
        }.build()

        return _folderLibrary!!
    }

private var _folderLibrary: ImageVector? = null
